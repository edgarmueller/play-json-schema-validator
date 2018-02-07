package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class BooleanSchemaSpec extends Specification with JsonSpec {

  "boolean scheam draft7" in {
    import Version7._
    validate("boolean_schema", "draft7")
  }

}
