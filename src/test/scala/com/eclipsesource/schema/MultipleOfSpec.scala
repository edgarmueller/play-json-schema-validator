package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class MultipleOfSpec extends Specification with JsonSpec {

  "multipleOf draft4" in {
    import Version4._
    validate("multipleOf")
  }

  "multipleOf draft7" in {
    import Version7._
    validate("multipleOf", "draft7")
  }
}
