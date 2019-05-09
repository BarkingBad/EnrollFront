import angulate2.std._
import scala.scalajs.js
import angulate2.core.{ Component, OnInit }
import angulate2.router.{ ActivatedRoute, Router }

@Component(
  selector = "app-dashboard-details",
  templateUrl = "./DashboardDetailComponent.html"
)
class DashboardDetailsComponent(
    val route: ActivatedRoute,
    // val httpService: CoursesService,
    val router: Router) extends OnInit {

  val dashDetail: js.Array[DashDetail] = js.Array()
  val courses: js.Array[Course] = js.Array()
  val id: Int = 0
  val isDisabled = true

  override def ngOnInit() {
    // this.id = +this.route.snapshot.paramMap.get("id");
    // this.httpService.getDashDetailById(this.id).subscribe(
    //   n => this.subjectsForm = this.fb.group({
    //       name: [n.Name],
    //       surname: [n.Surname],
    //       subject1: [n.Course1Id],
    //       subject2: [n.Course2Id],
    //       subject3: [n.Course3Id]
    //     }),
    //   err => console.log(err),
    //   () => this.disable()
    // );
    // this.httpService.getCourses().subscribe(c => this.courses = c.map(n => new Course(n.Id, n.Name)));

  }

//   enable() {
//     this.subjectsForm.get("name").enable();
//     this.subjectsForm.get("surname").enable();
//     this.isDisabled = false;
//   }

//   disable() {
//     this.subjectsForm.get("name").disable();
//     this.subjectsForm.get("surname").disable();
//     this.isDisabled = true;
//   }

//   delete() {
//     this.httpService.delete(this.id).subscribe(
//       _ => _,
//       err => console.log(err),
//       () => this.router.navigate(["dashboard"])
//     );
//   }

//   update() {
//     console.log(("".concat(
//       "{",
//         `"Id": ${this.id} `,
//         this.subjectsForm.controls["name"].touched ? `,"Name": \"${this.subjectsForm.controls["name"].value}\" ` : "",
//         this.subjectsForm.controls["surname"].touched ? `,"Surname": \"${this.subjectsForm.controls["surname"].value}\" ` : "",
//         this.subjectsForm.controls["subject1"].touched ? `,"Course1Id": ${this.subjectsForm.controls["subject1"].value} ` : "",
//         this.subjectsForm.controls["subject2"].touched ? `,"Course2Id": ${this.subjectsForm.controls["subject2"].value} ` : "",
//         this.subjectsForm.controls["subject3"].touched ? `,"Course3Id": ${this.subjectsForm.controls["subject3"].value} ` : "",
//       "}")));
//     this.httpService.patch(this.id, JSON.parse("".concat(
//       "{",
//         `"Id": ${this.id} `,
//         this.subjectsForm.controls["name"].touched ? `,"Name": \"${this.subjectsForm.controls["name"].value}\" ` : "",
//         this.subjectsForm.controls["surname"].touched ? `,"Surname": \"${this.subjectsForm.controls["surname"].value}\" ` : "",
//         this.subjectsForm.controls["subject1"].touched ? `,"Course1Id": ${this.subjectsForm.controls["subject1"].value} ` : "",
//         this.subjectsForm.controls["subject2"].touched ? `,"Course2Id": ${this.subjectsForm.controls["subject2"].value} ` : "",
//         this.subjectsForm.controls["subject3"].touched ? `,"Course3Id": ${this.subjectsForm.controls["subject3"].value} ` : "",
//       "}"))).subscribe(
//       _ => _,
//       err => console.log(err),
//       () => this.router.navigate(["dashboard"])
//     );
//   }

//   filterOnId(id1, id2) {
//     return this.courses == null ? [] : this.courses.filter(x => (x.Id !== id1 && x.Id !== id2));
//   }


}