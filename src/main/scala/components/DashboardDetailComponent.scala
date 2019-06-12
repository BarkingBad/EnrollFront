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
  val httpService: HttpService,
  val router: Router) extends OnInit {

  @Input
  var form: Form = _
  val dashDetail: js.Array[DashDetail] = js.Array()
  var courses: js.Array[Course] = js.Array()
  
  var isDisabled = true

  override def ngOnInit(): Unit = {
    route.params.switchMap((params, i) => httpService
      .getFormById(params("id").toInt))
      .subscribe(this.form = _)
    httpService.getCourses().subscribe((res: Response) => courses = js.JSON.parse(res.text()).asInstanceOf[js.Array[Course]])
  }

  def enable(): Unit = {
    this.isDisabled = false
  }

  def disable(): Unit = {
    this.isDisabled = true
  }

  def delete() {
    this.httpService.deleteForm(form.id.toInt)
    router.navigateTo("/dashboard")
  }

  def update() {
    this.httpService.patch(form.id.toInt, form)
    router.navigateTo("/dashboard")
  }

}