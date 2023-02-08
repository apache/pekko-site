# incubator-pekko-site

Publishing the Apache Pekko web site requires:

1. Clone https://github.com/apache/incubator-pekko-site into a local directory.
2. Check out the asf-staging branch.
3. In `incubator-pekko` repo, run
```
sbt unidoc docs/paradox
# next line requires Java 11 or above
sbt -Dpekko.genjavadoc.enabled=true Javaunidoc/doc 
```
4. Go back to your local copy of `incubator-pekko-site` and run
```
cp -r <path>/incubator-pekko/docs/target/paradox/site/main/ content/docs/pekko/current
cp -r <path>/incubator-pekko/target/scala-2.13/unidoc/ content/api/pekko/current
cp -r <path>/incubator-pekko/target/javaunidoc/ content/japi/pekko/current
```
5. Perform `git add` on the affected files and `git commit`.
6. Perform `git push`.
7. After a few minutes review https://pekko.staged.apache.org and make sure the appropriate changes are present.
8. Once the site has been approved checkout the asf-site branch.
9. Perform `git rebase asf-staging` followed by `git push`.
10. After a few minutes verify that https://pekko.apache.org has the correct changes.

This approach is based on the support for publishing sites provided by INFRA team. See [.asf.yaml features](https://cwiki.apache.org/confluence/display/INFRA/git+-+.asf.yaml+features) documentation.

This approach is based on the Apache Flume process, see [How to Release - Update the Web Site](https://cwiki.apache.org/confluence/display/FLUME/How+to+Release#HowtoRelease-Updatethewebsite).
