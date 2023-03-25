# incubator-pekko-site

## Status

This repo is a temporary solution to publishing the Apache Pekko website. The artifacts
are built in the Pekko modules. A Pekko committer can use the commands below to
copy these artifacts and commit them.

Anyone looking to help improve our docs should look at the Git repos
(eg [incubator-pekko](https://github.com/apache/incubator-pekko)) for the modules.
Typically, `sbt docs/paradoxBrowse` will build the docs and load them into your browser
when they are ready.

## Publishing

Publishing the Apache Pekko web site requires:

1. Clone https://github.com/apache/incubator-pekko-site into a local directory.
2. Check out the asf-staging branch.
3a. In `incubator-pekko` repo, run
```
sbt unidoc docs/paradox
# next line requires Java 11 or above
sbt -Dpekko.genjavadoc.enabled=true Javaunidoc/doc
```
3b. Go back to your local copy of `incubator-pekko-site` and run
```
mkdir -p content/docs/pekko/current/
mkdir -p content/api/pekko/current/
mkdir -p content/japi/pekko/current/
```
3c. Remain in `incubator-pekko-site` and run
```
cp -r <path>/incubator-pekko/docs/target/paradox/site/main/ content/docs/pekko/current/
cp -r <path>/incubator-pekko/target/scala-2.13/unidoc/ content/api/pekko/current/
cp -r <path>/incubator-pekko/target/javaunidoc/ content/japi/pekko/current/
```
4a. In `incubator-pekko-http` repo, run
```
sbt unidoc docs/paradox
# next line requires Java 11 or above
sbt -Dpekko.genjavadoc.enabled=true Javaunidoc/doc 
```
4b. Go back to your local copy of `incubator-pekko-site` and run
```
mkdir -p content/docs/pekko-http/current/
mkdir -p content/api/pekko-http/current/
mkdir -p content/japi/pekko-http/current/
```
4c. Remain in `incubator-pekko-site` and run
```
cp -r <path>/incubator-pekko-http/docs/target/paradox/site/main/ content/docs/pekko-http/current/
cp -r <path>/incubator-pekko-http/target/scala-2.13/unidoc/ content/api/pekko-http/current/
cp -r <path>/incubator-pekko-http/target/javaunidoc/ content/japi/pekko-http/current/
```
5. Perform `git add` on the affected files and `git commit`.
6. Perform `git push`.
7. After a few minutes review https://pekko.staged.apache.org and make sure the appropriate changes are present.
8. Once the site has been approved checkout the asf-site branch.
9. Perform `git rebase asf-staging` followed by `git push`.
10. After a few minutes verify that https://pekko.apache.org has the correct changes.

This approach is based on the support for publishing sites provided by INFRA team. See [.asf.yaml features](https://cwiki.apache.org/confluence/display/INFRA/git+-+.asf.yaml+features) documentation.

This approach is based on the Apache Flume process, see [How to Release - Update the Web Site](https://cwiki.apache.org/confluence/display/FLUME/How+to+Release#HowtoRelease-Updatethewebsite).
