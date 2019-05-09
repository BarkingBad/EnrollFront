import angulate2.std._
import scala.scalajs.js
import angulate2.core.Injectable
import angualte2.http.Http
import rxjs.RxPromise

@Injectable
class HttpService(http: Http) {
  val coursesUrl = "http://localhost:49902/api/coursesdb";
  val formsUrl = "http://localhost:49902/api/formsdb";

  def getCourses(): RxPromise[js.Array[Course]] = {
    http.get(coursesUrl).toPromise.map(_.jsonData[js.Array[Course]])
  }

  def getDashDetailById(id: Int): RxPromise[Course] = {
    getCourses map _.find(_.id == id).get
  }

  def postForm(form: Form): RxPromise[Course] = {
    http.postJson(formsUrl, JSON.stringify(form)).toPromise.map(_.jsonData[Form]).onError(handleError _);
  }

  def getForm(): RxPromise[js.Array[Course]] = {
    // tslint:disable-next-line:max-line-length
    return this.http.get<Odata>(this.odDashDetailUrl + `?$top=${top}&$skip=${top * skip}&$inlinecount=allpages&$orderby=${active} ${direction}`);
  }

  def delete(id: number): RxPromise[js.Any] = {
    return this.http.delete(this.formUrl + "/" + `${id}` );
  }

  def patch(id: number, form: any): RxPromise[js.Any] = {
    return this.http.patch(this.odFormUrl + "/" + `(${id})`,  form, httpOptions);
  }

  private def handleError(error: js.Any) = js.Dynamic.global.console.log(error)
}
