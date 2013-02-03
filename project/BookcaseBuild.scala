import sbt._
import Keys._

object BookcaseBuild extends Build {
  lazy val root = Project(id = "Bookcase",
                          base = file(".")) aggregate(core)
  lazy val core = Project(id = "Bookcase-Core",
                          base = file("bookcase-core"))
}
