name := "Bookcase"

version := "1.0.0"

startYear := Some(2013)

description := "Just another e-book collections management software."

organization := "Darong Mean"

organizationHomepage := Some(url("https://github.com/darong012/bookcase"))

licenses += "GPLv3" -> url("http://www.gnu.org/licenses/gpl-3.0.txt")

scalaVersion := "2.10.0"

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases"  at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++= Seq(
    "org.specs2" % "specs2_2.10" % "1.13" % "test")                  
