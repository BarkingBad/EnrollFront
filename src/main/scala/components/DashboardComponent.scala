import angulate2.std._
import scala.scalajs.js
import angulate2.core.{ Component, OnInit  }
// import { CoursesService } from "../courses.service";
import angulate2.router.Router

@Component(
  selector = "app-dashboard",
  templateUrl = "./classes/DashboardComponent.html"
)
class DashboardComponent(/*private httpService: CoursesService,*/ router: Router) extends OnInit {


  val forms = js.Array(
    new DashDetail(1, "Kacper", "Korban", "Scala", "Erlang", "Python")
  )
//   private count: number;
  val headElements = js.Array("Index", "Name", "Surname", "Course1", "Course2", "Course3")

  override def ngOnInit() {
    println(forms(0).name);
    // this.fetchData(10, 0, "Name", "asc");
  }




//   ngAfterViewChecked() {
//     if (this.paginator.pageIndex !== this.previousIndex || this.paginator.pageSize !== this.previousSize) {
//       this.previousIndex = this.paginator.pageIndex;
//       this.previousSize = this.paginator.pageSize;
//       this.fetchData(this.paginator.pageSize, this.paginator.pageIndex, this.sort.active, this.sort.direction);
//     }
//     if (this.previousActive !== this.sort.active || this.previousDirection !== this.sort.direction) {
//       this.previousActive = this.sort.active;
//       this.previousDirection = this.sort.direction;
//       this.fetchData(this.paginator.pageSize, this.paginator.pageIndex, this.sort.active, this.sort.direction);
//     }

//   }

//   fetchData(size: number, index: number, active: string, direction: string) {
//     this.httpService.getForm(size, index, active, direction).subscribe(
//       c => {
//         this.forms = c["value"].map(n => new DashDetail(n.Id, n.Name, n.Surname, n.Course1, n.Course2, n.Course3));
//         this.count = c["odata.count"];
//       });
//   }

//   f(myRowData) {
//     this.router.navigate(["dashboard", myRowData.Id]);
//   }
}
