// allow access to snapshots for pekko-sbt-paradox
resolvers += "Apache Nexus Snapshots".at("https://repository.apache.org/content/repositories/snapshots/")

addSbtPlugin("org.apache.pekko" % "pekko-sbt-paradox" % "0.0.0+37-3df33944-SNAPSHOT")
