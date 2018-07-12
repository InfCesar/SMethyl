
name := "smethyl-core"
version := "0.1"

scalaVersion := "2.11.9"
sbtVersion := "1.1.4"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1"
target in javah := file("smethyl-native/src/native/interfaces")
