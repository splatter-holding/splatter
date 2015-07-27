val SplatterVersion = "0.1.0"

lazy val root = (project in file("."))
  .settings(common: _*)
  .settings(
    name := "splatter-api",
    version := SplatterVersion,
    libraryDependencies ++= Seq(
    ),
    scalaVersion := "2.11.7"
  )



def common: Seq[Setting[_]] = Seq(
  organization := "splatter"
)
