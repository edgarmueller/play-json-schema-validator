package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class EnumSpec extends Specification with JsonSpec {
  "enum draft4" in {
    import Version4._
    validate("enum")
  }

  "enum draft7" in {
    import Version7._
    validate("enum", "draft7")
  }
}
