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
  var form: Form = Form(student, js.Array("", "", ""))
  var courses: js.Array[Course] = _
  
  var isDisabled = true

  override def ngOnInit(): Unit = {
    route.params.switchMap((params, i) => httpService
      .getFormById(params("id").toInt))
      .subscribe((res: Response) => form = res.json().asInstanceOf[Form], (x: Any) => x, 
        () => println("START"))
    httpService.getCourses().subscribe((res: Response) => courses = res.json().asInstanceOf[js.Array[Course]])
  }

  def enable(): Unit = {
    this.isDisabled = false
  }

  def disable(): Unit = {
    this.isDisabled = true
  }

  // def delete() {
  //   this.httpService.deleteForm(form.student.id.toInt)
  //   router.navigateTo("/dashboard")
  // }

  def submit() {
    this.httpService.postForm(form).subscribe((res: Response) => _, (x: Any) => x, () => router.navigateTo("/dashboard"))
  }

}