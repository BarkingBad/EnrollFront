package components

import angulate2.std._

import scala.scalajs.js
import angulate2.core.OnInit
import models._
import services.HttpService
import angulate2.router.Router

@Component(
  selector = "app-choosing-panel",
  templateUrl = "./classes/ChoosingPanelComponent.html"
)
class ChoosingPanelComponent(httpService: HttpService, router: Router) extends OnInit {

  var courses: js.Array[Course] = _

  // js.Array(
  //   Course(1, "Assembler"),
  //   Course(2, "C++"),
  //   Course(3, "Erlang"),
  //   Course(4, "Scala")
  // )

  val form = Form("", "", 0, 0, 0)
  
  override def ngOnInit() {
    httpService.getCourses().map(this.courses = _)
  }

//   onSubmitFinal() {
//       const name: string = this.subjectsForm.controls["name"].value;
//       const surname: string = this.subjectsForm.controls["surname"].value;
//       const course1 = this.subjectsForm.controls["subject1"].value;
//       const course2 = this.subjectsForm.controls["subject2"].value;
//       const course3 = this.subjectsForm.controls["subject3"].value;
//       this.coursesService.postForm(new Form(name, surname, course1, course2, course3))
//         .subscribe(
//           _ => _,
//           error => console.log(error),
//           () => this.router.navigate(["/dashboard"])
//         );
//   }

}
