package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class PatternPropertiesSpec extends Specification with JsonSpec {

  "patternProperties draft4" in {
    import Version4._
    validate("patternProperties")
  }

  "patternProperties draft7" in {
    import Version7._
    validate("patternProperties", "draft7")
  }
}
