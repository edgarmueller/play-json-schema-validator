package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class RequiredSpec extends Specification with JsonSpec {

  "required draft4" in {
    import Version4._
    validate("required")
  }

  "required draft7" in {
    import Version7._
    validate("required", "draft7")
  }
}
