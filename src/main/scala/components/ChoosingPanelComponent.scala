package components

import angulate2.std._

import scala.scalajs.js
import angulate2.core.OnInit
import angulate2.http.Response
import models._
import services.HttpService
import angulate2.router.Router
import rxjs.Observable

@Component(
  selector = "app-choosing-panel",
  templateUrl = "./classes/ChoosingPanelComponent.html"
)
class ChoosingPanelComponent(httpService: HttpService, router: Router) extends OnInit {

  var courses: js.Array[Course] = _
  var response: Response = _
  
  val form = Form(null, null, null, js.Array(0, 0, 0))

  override def ngOnInit(): Unit = {
    courses = js.Array(Course(1, "A"), Course(2, "B"), Course(3, "C"), Course(4, "D"))
    httpService.getCourses().subscribe((res: Response) => courses = js.JSON.parse(res.text()).asInstanceOf[js.Array[Course]])
  }


  def submit() {
    this.httpService.postForm(form)
    router.navigateTo("/dashboard")
  }

}
