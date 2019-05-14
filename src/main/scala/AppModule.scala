import angulate2.forms.FormsModule
import angulate2.http.HttpModule
import angulate2.platformBrowser.BrowserModule
import angulate2.router.RouterModule
import angulate2.std._
import components._
import services._

import scala.scalajs._




@NgModule(
  imports = @@[
    BrowserModule,
    HttpModule,
    FormsModule
    ] :+
    RouterModule.forRoot(js.Array(
      Route(path = "panel", component = %%[ChoosingPanelComponent]),
      Route(path = "dashboard", component = %%[DashboardComponent]),
      Route(path = "dashboard/:id", component = %%[DashboardDetailComponent]),
      Route(path = "", redirectTo = "/dashboard", pathMatch = "full")
    )),
  declarations = @@[
    AppComponent,
    ChoosingPanelComponent,
    DashboardComponent,
    DashboardDetailComponent
  ],
  providers = @@[HttpService],
  bootstrap = @@[AppComponent]
)
class AppModule {
}

