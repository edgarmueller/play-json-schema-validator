package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class AdditionalPropertiesSpec extends Specification with JsonSpec {

  "additionalProperties draft4" in {
    import Version4._
    validate("additionalProperties")
  }

  "additionalProperties draft7" in {
    import Version7._
    validate("additionalProperties", "draft7")
  }
}
