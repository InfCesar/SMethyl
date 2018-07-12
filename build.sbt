
name := "SMethyl"
version := "0.1"

scalaVersion := "2.11.9"
sbtVersion := "1.1.4"

lazy val core = (project in file("smethyl-core")).dependsOn(native % Runtime)   // Scala project
lazy val native = (project in file("smethyl-native")).enablePlugins(JniNative)  // Native code and build script
