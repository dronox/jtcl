name := "jtcl"
organization := "com.github.dronox"
version := "2.9.1"

publishTo := sonatypePublishTo.value
crossPaths := false

// Compiler Options
scalaVersion := "2.12.7"
scalacOptions ++= Seq(
  "-encoding", "UTF-8",
  "-unchecked",
  "-deprecation",
  "-Xfuture",
  "-Yno-adapted-args",
  "-feature",
)
javacOptions ++= Seq("-source", "1.8", "-target", "1.8") 

// Library Dependencies
libraryDependencies += "org.codehaus.janino" % "janino" % "3.0.11"

// add license files to jar
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.amd") -> "license.amd"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.itcl") -> "license.itcl"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.tcllib") -> "license.tcllib"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.terms") -> "license.terms"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.ucb") -> "license.ucb"