package components

import angulate2.std._

import scala.scalajs.js
import angulate2.http.Response
import angulate2.core.{Component, OnInit}
import angulate2.router.{ActivatedRoute, Router}
import models._
import services._

@Component(
  selector = "app-dashboard-details",
  templateUrl = "./classes/DashboardDetailComponent.html"
)
class DashboardDetailComponent(
  val route: ActivatedRoute,
  httpService: HttpService,
  val router: Router) extends OnInit {
  var student = Student("", "", "")
  var c = js.Array[String]("", "", "")
  var form: Form = Form(student, c)
  var courses: js.Array[Course] = _
  var id: Int = _
  var isDisabled = true

  override def ngOnInit(): Unit = {
    route.params.switchMap((params, i) => {
        id = params("id").toInt
        httpService.getFormById(id)
      })
      .subscribe((res: Response) => {
        form = res.json().asInstanceOf[Form]
      }
      )

    httpService.getCourses().subscribe((res: Response) => courses = res.json().asInstanceOf[js.Array[Course]])
  }

  def enable(): Unit = {
    this.isDisabled = false
  }

  def disable(): Unit = {
    this.isDisabled = true
  }

  def delete() {
    this.httpService.deleteForm(id).subscribe((res: Response) => _, (x: Any) => x, () => router.navigateTo("/dashboard"))
  }

  def submit() {
    form.courses(0) = "" + form.courses(0)
    form.courses(1) = "" + form.courses(1)
    form.courses(2) = "" + form.courses(2)
    this.httpService.postForm(form).subscribe((res: Response) => _, (x: Any) => x, () => router.navigateTo("/dashboard"))
  }

}