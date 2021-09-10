val scala3Version = "3.0.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "com.fasterxml.jackson.module" % "jackson-module-scala_2.13" % "2.12.5",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.12.5",
    )
  )
