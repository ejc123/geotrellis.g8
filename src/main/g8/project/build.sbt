resolvers += Classpaths.typesafeResolver

resolvers += Resolver.url("sbt-plugin-releases",
  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse" % "1.5.0")

// addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.7.2")

addSbtPlugin("cc.spray" % "sbt-revolver" % "0.6.0-SNAPSHOT" from "http://n0d.es/jars/sbt-revolver-0.6.0-SNAPSHOT.jar")

// seq(ProguardPlugin.proguardSettings :_*)

