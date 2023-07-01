enablePlugins(ParadoxPlugin, PekkoParadoxPlugin)

resolvers += "Apache Nexus Snapshots".at("https://repository.apache.org/content/repositories/snapshots/")

pekkoParadoxGithub := Some("https://github.com/apache/incubator-pekko-site")

// By default any hidden files placed inside src/main/public are ignored
inConfig(Assets)(Seq(
  excludeFilter := excludeFilter.value -- ".htaccess"
))
