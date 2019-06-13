package services

import angulate2.std._

import scala.scalajs.js
import angulate2.http._
import models._
import rxjs.RxPromise
import rxjs._
import upickle.default._

@Injectable
class HttpService(http: Http) {
  val coursesUrl = "http://localhost:9000/courses"
  val studentsUrl = "http://localhost:9000/students"

  val httpOptions = RequestOptionsArgs(
    headers = new Headers(js.Dynamic.literal(
      "Content-Type" -> "application/json",
      "Accept" -> "my-auth-token")
    )
  )

  def getCourses() = {
    http.get(coursesUrl + "/all")
  }

  def getDashDetails() = {
    http.get(studentsUrl + "/allWithCourses")
  }

  def getDashDetailById(id: Int): RxPromise[DashDetail] = {
    http.get(studentsUrl + s"/forId/$id").toPromise.map(_.jsonData[DashDetail])
  }

  def postForm(form: Form): RxPromise[Form] = {
    http.postJson(studentsUrl + "/insertWithCourses", form).toPromise.map(_.jsonData[Form])
  }

  def deleteForm(id: Int): RxPromise[Unit] = {
    http.delete(studentsUrl + "/" + s"$id").toPromise.map(_ => ())
  }

  private def handleError(error: js.Any) = js.Dynamic.global.console.log(error)
}
