import Dependencies._

lazy val currentVersion = "0.1.0-SNAPSHOT"

lazy val commonSettings = Seq(
  scalaVersion := "$scalaVersion$",
  organization := "$organization$",
  version := currentVersion,
  scalacOptions in (Compile, compile) ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-unchecked",
    // "-Xfatal-warnings",
    "-Xlint"
  ),

  javacOptions ++= Seq("-encoding", "UTF-8")
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
    name := "$name$",
    libraryDependencies += scalaTest % "test"
  )
