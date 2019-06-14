package components

import angulate2.std._

import scala.scalajs.js
import angulate2.http.Response
import angulate2.core.{Component, OnInit}
import angulate2.router.Router
import models.DashDetail
import services._

@Component(
  selector = "app-dashboard",
  templateUrl = "./classes/DashboardComponent.html"
)
class DashboardComponent(val httpService: HttpService, val router: Router) extends OnInit {


  var dashDetails: js.Array[DashDetail] = _
  val headElements = js.Array("Index", "Name", "Surname", "Course1", "Course2", "Course3")

  override def ngOnInit() {
    httpService.getDashDetails().subscribe((res: Response) => dashDetails = res.json().asInstanceOf[js.Array[DashDetail]])
  }
}