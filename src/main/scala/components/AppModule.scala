import angulate2.std._
import angulate2.platformBrowser.BrowserModule
import angulate2.router.{Routes, RouterModule}
import angulate2.http.HttpModule
import angulate2.forms.FormsModule
import scala.scalajs._



@NgModule(
  imports = @@[
    BrowserModule,
    HttpModule,
    FormsModule
    ] :+
    RouterModule.forRoot(js.Array(
      Route(path = "panel", component = %%[ChoosingPanelComponent]),
      Route(path = "auth", component = %%[AuthComponent]),
      Route(path = "dashboard", component = %%[DashboardComponent]),
      // Route(path = "dashboard/:id", component = %%[DashboardDetailsComponent]),
      Route(path = "", redirectTo = "/auth", pathMatch = "full")
    )),
  declarations = @@[
    AppComponent,
    AuthComponent,
    ChoosingPanelComponent,
    DashboardComponent
    // DashboardDetailsComponent
  ],

  bootstrap = @@[AppComponent]
)
class AppModule {
}

