package com.github.mperry

/**
  * Created by MarkPerry on 6 Mar 17.
  */

import argonaut._, Argonaut._

case class Person(name: String, age: Int, things: List[String])

object Person {

  implicit def PersonCodecJson: CodecJson[Person] =
    casecodec3(Person.apply, Person.unapply)("name", "age", "things")

}
