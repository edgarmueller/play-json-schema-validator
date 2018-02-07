package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

import play.api.libs.json.JsString

class MinLengthSpec extends Specification with JsonSpec {


  "validate draft4" in {
    import Version4._
    validate("minLength")
  }

  "validate draft7" in {
    import Version7._
    validate("minLength", "draft7")
  }

  "MinLength" should {

    import Version4._

    "validate against numeric strings that are long enough" in {
      val schema = JsonSource.schemaFromString(
        """{
          |"minLength": 3
        }""".stripMargin).get

      SchemaValidator().validate(schema)(JsString("123")).isSuccess must beTrue
    }

    "not validate against numeric strings that are too short" in {
      val schema = JsonSource.schemaFromString(
        """{
          |"minLength": 3
        }""".stripMargin).get

      SchemaValidator().validate(schema)(JsString("12")).isError must beTrue
    }

  }
}

