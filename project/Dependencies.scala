import sbt._

object Dependencies {
  val JakartaMailVersion = "2.0.0-RC6"
  val AkkaVersion        = "2.6.10"
  val ScalaTestVersion   = "3.2.2"

  lazy val all = Seq(
    "com.sun.mail"       % "jakarta.mail" % JakartaMailVersion,
    "org.scalatest"     %% "scalatest"    % ScalaTestVersion % Test,
    "com.typesafe.akka" %% "akka-stream"  % AkkaVersion
  )
}
