package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification
import java.net.URL

class NotSpec extends Specification with JsonSpec {

  "not draft4" in {
    import Version4._
    validate("not")
  }

  "not draft7" in {
    import Version7._
    validate("not", "draft7")
  }
}
