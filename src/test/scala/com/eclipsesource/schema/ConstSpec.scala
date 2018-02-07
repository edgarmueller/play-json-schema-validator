package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class ConstSpec extends Specification with JsonSpec {

  "const draft7" in {
    import Version7._
    validate("const", "draft7")
  }

}
