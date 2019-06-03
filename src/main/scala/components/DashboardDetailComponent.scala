package components

import angulate2.std._

import scala.scalajs.js
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

  val dashDetail: js.Array[DashDetail] = js.Array()
  val courses: js.Array[Course] = js.Array()
  @Input
  val form: Form = _
  var isDisabled = true

  override def ngOnInit(): Unit = {
    route.params.switchMap((params, i) => httpService
      .getForm(params("id").toInt))
      .subscribe(this.form = _)
    httpService.getCourses().subscribe((res: Response) => courses = js.JSON.parse(res.text()).asInstanceOf[js.Array[Course]])
  }

  def enable(): Unit = {
    this.isDisabled = false
  }

  def disable(): Unit = {
    this.isDisabled = true
  }

  delete() {
    this.httpService.delete(this.id)
    router.navigateTo("/dashboard")
  }

  update() {
    this.httpService.patch(this.id, form)
    router.navigateTo("/dashboard")
  }

}