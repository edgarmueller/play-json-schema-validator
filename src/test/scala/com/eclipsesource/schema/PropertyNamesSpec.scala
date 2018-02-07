package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class PropertyNamesSpec extends Specification with JsonSpec {

  "propertyNames draft7" in {
    import Version7._
    validate("propertyNames", "draft7")
  }

}
