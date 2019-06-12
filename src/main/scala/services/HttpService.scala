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
  val formsUrl = "http://localhost:9000/forms"
  val dashDetailsUrl = "http://localhost:9000/dashdetails"

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
    http.get(dashDetailsUrl + "/all")
  }

  def getDashDetailById(id: Int): RxPromise[DashDetail] = {
    http.get(dashDetailsUrl + s"/$id").toPromise.map(_.jsonData[DashDetail])
  }

  def postForm(form: Form): RxPromise[Form] = {
    http.postJson(formsUrl, form).toPromise.map(_.jsonData[Form])
  }

  def getFormById(id: Int): RxPromise[Form] = {
    http.get(formsUrl + s"/$id").toPromise.map(_.jsonData[Form])
  }

  def deleteForm(id: Int): RxPromise[Unit] = {
    http.delete(formsUrl + "/" + s"$id").toPromise.map(_ => ())
  }

  def patch(id: Int, form: Form): RxPromise[Form] = {
    http.putJson(formsUrl + "/" + s"$id", form).toPromise.map(_.jsonData[Form])
  }

  private def handleError(error: js.Any) = js.Dynamic.global.console.log(error)
}
