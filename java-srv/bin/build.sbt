name := "scalapass"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  "org.mongodb" % "mongo-java-driver" % "3.12.7"
)

mainClass := Some("example.App")
