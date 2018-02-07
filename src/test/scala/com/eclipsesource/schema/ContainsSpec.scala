package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class ContainsSpec extends Specification with JsonSpec {

  "contains draft7" in {
    import Version7._
    validate("contains", "draft7")
  }

}
