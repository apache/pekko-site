enablePlugins(ParadoxPlugin, PekkoParadoxPlugin)

resolvers += Resolver.ApacheMavenSnapshotsRepo

pekkoParadoxGithub := Some("https://github.com/apache/incubator-pekko-site")

// By default any hidden files placed inside src/main/public are ignored
inConfig(Assets)(Seq(
  excludeFilter := excludeFilter.value -- ".htaccess"
))

ThisBuild / githubWorkflowTargetBranches := Seq("main")
ThisBuild / githubWorkflowTargetTags ++= Seq("v*")
ThisBuild / githubWorkflowPublishTargetBranches := Seq()

ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("11"))

ThisBuild / githubWorkflowBuild := Seq(
  WorkflowStep.Sbt(
    List("test", "paradox"),
    name = Some("Build project")
  )
)
