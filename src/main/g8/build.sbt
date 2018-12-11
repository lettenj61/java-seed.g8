import Dependencies._

lazy val root = (project in file("."))
  .settings(
    organization  := "com.example",
    scalaVersion  := "$scalaVersion$",
    version       := "0.1.0-SNAPSHOT"
    name          := "$name$",
    libraryDependencies += scalaTest % Test
  )
