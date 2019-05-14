package components


import scala.scalajs.js
import angulate2.core.{Component, OnInit}
import angulate2.router.Router
import models.DashDetail

@Component(
  selector = "app-dashboard",
  templateUrl = "./classes/DashboardComponent.html"
)
class DashboardComponent(/*httpService: HttpService,*/ router: Router) extends OnInit {


  val forms = js.Array(
    DashDetail(1, "Kacper", "Korban", "Scala", "Erlang", "Python"),
    DashDetail(2, "Wojtek", "Dolata", "Assembler", "C++", "Ruby")
  )
  val headElements = js.Array("Index", "Name", "Surname", "Course1", "Course2", "Course3")

  override def ngOnInit() {
    // this.fetchData(10, 0, "Name", "asc");
  }
}
