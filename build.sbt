import Dependencies._

ThisBuild / scalaVersion := "2.13.3"
ThisBuild / organization := "io.foxintelligence"
ThisBuild / organizationName := "Foxintelligence"

lazy val root = (project in file("."))
  .settings(
    name := "live-coding-scala",
    libraryDependencies ++= all
  )
