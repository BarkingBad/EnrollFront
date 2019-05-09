import angulate2.std._
import scala.scalajs.js
import angulate2.core.OnInit
import angulate2.router.Router


@Component(
  selector = "app-auth",
  templateUrl = "./classes/AuthComponent.html"
)
class AuthComponent(router: Router) extends OnInit {

    override def ngOnInit() {
    }

    def submit(): Unit = router.navigateTo("/panel")

}
