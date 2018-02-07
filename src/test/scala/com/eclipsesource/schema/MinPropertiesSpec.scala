package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class MinPropertiesSpec extends Specification with JsonSpec {

  "minProperties draft4" in {
    import Version4._
    implicit val validator = SchemaValidator(Version4)
    validate("minProperties")
  }

  "minProperties draft7" in {
    import Version7._
    implicit val validator = SchemaValidator(Version7)
    validate("minProperties", "draft7")
  }
}
