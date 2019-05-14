package models

import angulate2.std._
import scala.scalajs.js
import angulate2.ext.data._

@Data
case class Form(name: String, surname: String, course1: Int, course2: Int, course3: Int)
