package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class PropertiesSpec extends Specification with JsonSpec {

  "properties draft4" in {
    import Version4._
    validate("properties")
  }

  "properties draft7" in {
    import Version7._
    validate("properties", "draft7")
  }
}
