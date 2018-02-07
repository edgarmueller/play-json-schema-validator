package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class MinItemsSpec extends Specification with JsonSpec {

  "minItems draft4" in {
    import Version4._
    validate("minItems")
  }

  "minItems draft7" in {
    import Version7._
    validate("minItems", "draft7")
  }
}
