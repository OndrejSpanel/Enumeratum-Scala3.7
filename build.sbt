ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.7.0"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "SandboxJS",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "com.beachape" %%% "enumeratum" % "1.7.6"
  )
