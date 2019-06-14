package models

import angulate2.std._
import scala.scalajs.js
import angulate2.ext.data._

@Data
case class Form(student: Student, courses: js.Array[Int]) extends js.Any
