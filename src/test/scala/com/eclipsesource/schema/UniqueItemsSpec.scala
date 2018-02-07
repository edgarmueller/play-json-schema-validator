package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class UniqueItemsSpec extends Specification with JsonSpec {

  "uniqueItems draft4" in {
    import Version4._
    validate("uniqueItems")
  }

  "uniqueItems draft7" in {
    import Version7._
    validate("uniqueItems", "draft7")
  }
}

