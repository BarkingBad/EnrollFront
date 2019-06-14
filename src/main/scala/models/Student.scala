package models

import angulate2.std._
import scala.scalajs.js
import angulate2.ext.data._

@Data
case class Student(id: String, firstName: String, lastName: String) extends js.Any