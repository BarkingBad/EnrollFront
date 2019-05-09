import angulate2.std._
import scala.scalajs.js
import angulate2.core.{ Component, OnInit, Input }
// import { Student } from "../student";
// import { FormBuilder, Validators } from "@angular/forms";
// import { CoursesService } from "../courses.service";
// import { Course } from "../course";
// import { Form } from "../Form";
import angulate2.router.Router

@Component(
  selector = "app-choosing-panel",
  templateUrl = "./classes/ChoosingPanelComponent.html"
)
class ChoosingPanelComponent(router: Router) extends OnInit {

  @Input
  var index: String = _;

//   val courses: Course[];

//   subjectsForm = this.fb.group({
//     name: [""],
//     surname: [""],
//     subject1: [""],
//     subject2: [""],
//     subject3: [""]
//   });

//   constructor(private fb: FormBuilder, private coursesService: CoursesService, private router: Router) { }

  override def ngOnInit() {
    // this.coursesService.getCourses().subscribe(c => this.courses = c.map(n => new Course(n.Id, n.Name)));
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

//   filterOnId(id1, id2) {
//     return this.courses == null ? [] : this.courses.filter(x => (x.Id !== id1 && x.Id !== id2));
//   }
}
