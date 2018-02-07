package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class MaxPropertiesSpec extends Specification with JsonSpec {

  "maxProperties draft4" in {
    import Version4._
    validate("maxProperties")
  }

  "maxProperties draft7" in {
    import Version7._
    validate("maxProperties", "draft7")
  }
}
