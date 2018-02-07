package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification
import play.api.libs.json._

class MaxLengthSpec extends Specification with JsonSpec {

  "maxLength draft4" in {
    import Version4._
    validate("maxLength")
  }

  "maxLength draft7" in {
    import Version7._
    validate("maxLength", "draft7")
  }

  "MaxLength" should {
    import Version4._
    "fail with an error in case the string is too long" in {
      val schema = JsonSource.schemaFromString(
        """{
          |"maxLength": 2
        }""".stripMargin).get
      val json = JsString("foo")
      val result = SchemaValidator().validate(schema)(json)
      result.isError must beTrue
      result.asEither must beLeft.like {
        case error => (error.toJson(0) \ "msgs") == JsDefined(JsArray(Seq(JsString("'foo' exceeds maximum length of 2."))))
      }
    }
  }
}
