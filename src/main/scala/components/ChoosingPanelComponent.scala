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
  val student = Student("", "", "")
  val form = Form(student, js.Array("", "", ""))

  override def ngOnInit(): Unit = {
    httpService.getCourses().subscribe((res: Response) => courses = res.json().asInstanceOf[js.Array[Course]])
  }


  def submit() {
    this.httpService.postForm(form).subscribe((res: Response) => _, (x: Any) => x, () => router.navigateTo("/dashboard"))
  }

}
