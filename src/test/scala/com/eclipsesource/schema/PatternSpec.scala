package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class PatternSpec extends Specification with JsonSpec {

  "pattern draft4" in {
    import Version4._
    validate("pattern")
  }

  "pattern draft7" in {
    import Version7._
    validate("pattern", "draft7")
  }
}
