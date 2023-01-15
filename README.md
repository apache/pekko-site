# incubator-pekko-site

Publishing the Apache Pekko web site requires:

1. Clone https://github.com/apache/incubator-pekko-site into a local directory.
2. Check out the asf-staging branch.
3. If you have used `sbt docs/paradox` in `incubator-pekko` repo, you can use `cp -r <path>/incubator-pekko/docs/target/paradox/site/main/ content/`
4. Perform `git add` on the affected files and `git commit`.
5. Perform `git push`.
6. After a few minutes review https://pekko.staged.apache.org and make sure the appropriate changes are present.
7. Once the site has been approved checkout the asf-site branch.
8. Perform `git rebase asf-staging` followed by `git push`.
9. After a few minutes verify that https://pekko.apache.org has the correct changes.

Further information regarding what to edit in the site during a release may be found at 
[How to Release - Update the Web Site](https://cwiki.apache.org/confluence/display/FLUME/How+to+Release#HowtoRelease-Updatethewebsite).
