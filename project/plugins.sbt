// allow access to snapshots for pekko-sbt-paradox
resolvers += "Apache Nexus Snapshots".at("https://repository.apache.org/content/repositories/snapshots/")

addSbtPlugin("org.apache.pekko" % "pekko-sbt-paradox" % "0.0.0+43-d9643c78-SNAPSHOT")
addSbtPlugin("com.github.sbt" % "sbt-github-actions" % "0.15.0")
