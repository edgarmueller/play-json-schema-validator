package com.eclipsesource.schema.internal

object Keywords {

  val ID = "$id"
  val Id = ID
  val Schema = "$schema"
  val Description = "description"

  val Default = "default"
  val Ref = "$ref"

  object Object {
    val Properties = "properties"
    val PatternProperties = "patternProperties"
    val AdditionalProperties = "additionalProperties"
    val Required = "required"
    val Dependencies = "dependencies"
    val MinProperties = "minProperties"
    val MaxProperties = "maxProperties"
    val PropertyNames = "propertyNames"
  }

  object Any {
    val AllOf = "allOf"
    val AnyOf = "anyOf"
    val OneOf = "oneOf"
    val Not = "not"
    val Definitions = "definitions"
    val Description = "description"
    val Enum = "enum"
    val Type = "type"
    val Id = ID
  }

  object Number {
    val Min = "minimum"
    val Max = "maximum"
    val ExclusiveMin = "exclusiveMinimum"
    val ExclusiveMax = "exclusiveMaximum"
    val MultipleOf = "multipleOf"
  }

  object String {
    val MinLength = "minLength"
    val MaxLength = "maxLength"
    val Pattern = "pattern"
    val Format = "format"
  }

  object Array {
    val AdditionalItems = "additionalItems"
    val MinItems = "minItems"
    val MaxItems = "maxItems"
    val UniqueItems = "uniqueItems"
    val Contains = "contains"
    val Items = "items"
  }

  val ofObject = List(
    Keywords.Id,
    Keywords.Schema,
    Keywords.Description,

    Keywords.Default,
    Keywords.Ref,
    Keywords.Object.Properties,
    Keywords.Object.PatternProperties,
    Keywords.Object.AdditionalProperties,
    Keywords.Object.Required,
    Keywords.Object.Dependencies,
    Keywords.Any.AllOf,
    Keywords.Any.AnyOf,
    Keywords.Any.OneOf,
    Keywords.Any.Type,

    "if",
    "then",
    "else"
  )

  val ofArray = List(
    Keywords.Id,

    Keywords.Array.AdditionalItems,
    Keywords.Array.Items,
    Keywords.Array.MaxItems,
    Keywords.Array.MinItems,
    Keywords.Array.Contains,
    Keywords.Array.UniqueItems,
    Keywords.Any.AllOf,
    Keywords.Any.AnyOf,
    Keywords.Any.OneOf,
    Keywords.Any.Type
  )

  val ofTuple = ofArray
}
