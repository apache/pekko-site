enablePlugins(ParadoxPlugin, PekkoParadoxPlugin)

resolvers += Resolver.ApacheMavenSnapshotsRepo

pekkoParadoxGithub := Some("https://github.com/apache/incubator-pekko-site")

// By default any hidden files placed inside src/main/public are ignored
inConfig(Assets)(Seq(
  excludeFilter := excludeFilter.value -- ".htaccess"
))
