package com.github.mperry

/**
  * Created by MarkPerry on 6 Mar 17.
  */


import argonaut.Json
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.github.mperry.Person.PersonCodecJson
import com.github.mperry.Person._
import argonaut._, Argonaut._

@RunWith(classOf[JUnitRunner])
class PersonTest extends FunSuite {
  test("someLibraryMethod is always true") {
    val person = Person("Bama Bam", 2, List("club"))
    val json: Json = person.asJson
    val prettyprinted: String = json.spaces2
    val parsed: Option[Person] = prettyprinted.decodeOption[Person]
    println(parsed)

//    def library = new Person()
    assert(true)
  }
}
