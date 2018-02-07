package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class MaxItemsSpec extends Specification with JsonSpec {

  "maxItems draft4" in {
    import Version4._
    validate("maxItems")
  }

  "maxItems draft7" in {
    import Version7._
    validate("maxItems", "draft7")
  }
}

