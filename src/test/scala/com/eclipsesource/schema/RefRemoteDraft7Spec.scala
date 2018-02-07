package com.eclipsesource.schema

import com.eclipsesource.schema.test.JsonSpec
import org.specs2.mutable.Specification

class RefRemoteDraft7Spec extends Specification with JsonSpec {

  import Version7._

  override val validator = SchemaValidator()
    .addSchema(
      "http://localhost:1234/integer.json",
      {
        val x  =JsonSource.schemaFromStream(
          getClass.getResourceAsStream("/remotes/integer.json")
        )
        println("x " + x)
        x.get
      }
    )
    .addSchema(
      "http://localhost:1234/subSchemas.json",
      {
        val y = JsonSource.schemaFromStream(
          getClass.getResourceAsStream("/remotes/subSchemas.json")
        )
        println("y " + y)
        y.get
      }
    )
    .addSchema(
      "http://localhost:1234/folder/folderInteger.json",
      {
        val z = JsonSource.schemaFromStream(
          getClass.getResourceAsStream("/remotes/folder/folderInteger.json")
        )
        println("z " + z)
        z.get
      }
    )
    .addSchema(
      "http://localhost:1234/name.json",
      {
        val zz = JsonSource.schemaFromStream(
          getClass.getResourceAsStream("/remotes/name.json")
        )
        println("zz" + zz)
        zz.get
      }
    )

  "refRemote draft7" in {
    validate("refRemote", "draft7")
  }
}
