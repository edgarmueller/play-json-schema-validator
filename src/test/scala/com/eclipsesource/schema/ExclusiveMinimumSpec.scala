package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class ExclusiveMinimumSpec extends Specification with JsonSpec {

  import Version7._
  validate("exclusiveMinimum", "draft7")

}
