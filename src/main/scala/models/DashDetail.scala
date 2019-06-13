package models

import angulate2.std._
import scala.scalajs.js
import angulate2.ext.data._


@Data
case class DashDetail(student: Student, courses: js.Array[String]) extends js.Any