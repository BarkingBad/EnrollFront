package models

import angulate2.std._
import scala.scalajs.js
import angulate2.ext.data._
import angulate2.http._
import upickle.default.{ReadWriter => RW, macroRW}

@Data
case class Course(id: Int, name: String) extends js.Any

//object Course {
//  implicit val rw: RW[Course] = macroRW
//}