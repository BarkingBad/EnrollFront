package components

import angulate2.std._
import angulate2.core.Component
import angulate2.router.Router

@Component(
  selector = "my-app",
  templateUrl = "./classes/AppComponent.html"
)
class AppComponent(router: Router) {
  val title = "forms-app"
}