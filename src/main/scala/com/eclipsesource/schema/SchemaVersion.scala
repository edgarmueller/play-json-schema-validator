package com.eclipsesource.schema

import com.eclipsesource.schema.internal.serialization.{JSONSchemaReads, JSONSchemaWrites}

trait SchemaKeywords {
  def id: String
}

sealed trait SchemaVersion extends JSONSchemaReads with JSONSchemaWrites {
  def keywords: SchemaKeywords
}

case object Version4 extends SchemaVersion {
  override def keywords: SchemaKeywords = new SchemaKeywords {
    override def id: String = "id"
  }
}
case object Version7 extends SchemaVersion {
  override def keywords: SchemaKeywords = new SchemaKeywords {
    override def id: String = "$id"
  }
}

trait HasSchemaVersion {
  def version: SchemaVersion
}