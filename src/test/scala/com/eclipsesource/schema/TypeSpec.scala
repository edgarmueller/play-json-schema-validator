package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class TypeSpec extends Specification with JsonSpec {
  "type draft4" in {
    import Version4._
    validate("type")
  }
  "type draft7" in {
    import Version7._
    validate("type", "draft7")
  }
}
