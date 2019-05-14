package models

import angulate2.std._
import scala.scalajs.js
import angulate2.ext.data._

@Data
case class Student(name: String, surname: String, index: Int, subjects: js.Array[String])