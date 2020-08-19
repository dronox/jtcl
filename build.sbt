name := "jtcl"
organization := "com.github.dronox"
version := "2.9.4"

publishTo := sonatypePublishTo.value
crossPaths := false
useGpg := true

// Compiler Options
scalaVersion := "2.12.7"
val javaCompilerOptions = Seq("-source", "1.8", "-target", "1.8")
javacOptions in (Compile, compile) ++= javaCompilerOptions
javacOptions in (Test) ++= javaCompilerOptions

// Library Dependencies
libraryDependencies += "org.codehaus.janino" % "janino" % "3.0.11"
libraryDependencies += "junit" % "junit" % "4.13" % Test
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

// add license files to jar
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.amd") -> "license.amd"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.itcl") -> "license.itcl"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.tcllib") -> "license.tcllib"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.terms") -> "license.terms"
mappings in (Compile, packageBin) += (baseDirectory.value / "src" / "main" / "licenses" / "license.ucb") -> "license.ucb"
