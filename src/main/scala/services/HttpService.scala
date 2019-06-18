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

  val header = Headers()
  header.append("Access-Control-Allow-Origin", "*")
  header.append("Content-Type", "application/json")
  val httpOptions = RequestOptionsArgs(
    headers = header
  )

  def getCourses() = {
    http.get(coursesUrl + "/all")
  }

  def getDashDetails() = {
    http.get(studentsUrl + "/allWithCourses")
  }

  def getFormById(id: Int) = {
    http.get(studentsUrl + s"/forId/$id")
  }

  def postForm(form: Form) = {
    http.postJson(studentsUrl + "/insertWithCourses", form, httpOptions)
  }

  def deleteForm(id: Int) = {
    http.delete(studentsUrl + s"/delete/$id", httpOptions)
  }

  private def handleError(error: js.Any) = js.Dynamic.global.console.log(error)
}
