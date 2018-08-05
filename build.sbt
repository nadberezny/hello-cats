import Dependencies._


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization  := "nadberezny",
      scalaVersion  := "2.12.6",
      version       := "0.1.0-SNAPSHOT",
      scalacOptions := Seq(
        "Ypartial-unification")
    )),
    name := "hello-cats",
    libraryDependencies ++= { Seq(
      cats,
      scalaTest % Test
    )}
  )
