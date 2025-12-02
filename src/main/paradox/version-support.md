# Version Support

Apache Pekko uses [Semantic Versioning 2.0.0](https://semver.org/).

Currently, the versions of the various Apache Pekko @ref:[Modules](modules.md) are fairly
closely synched up. This may not continue to be the case in future and we aim to
keep this page up to date to try to describe what versions work with each other.

A separate but related topic is our set of [Binary Compatibility rules](https://pekko.apache.org/docs/pekko/current/common/binary-compatibility-rules.html).

## Version 2.0.x Milestones

We have started releasing 2.0.0 milestone releases beginning with the core Pekko
module and working through the modules that are most widely used. The milestone releases
are only for testing purposes and to facilitate library maintainers. They are not meant
to be used in production.

Due to quite a lot of deprecated code being removed in 2.0.x, it is unlikely that libs
built against Pekko 1.x jars will work with Pekko 2.0.x. This largely depends on whether
the lib uses deprecated methods or not. The larger the code base, the more likely that
there is something that relies on a method that is removed in 2.0.x.

## Version 1.x

It is best to use the latest 1.x releases for all the Pekko modules out there.

We will continue to fix bugs and upgrade dependencies when they fix issues. Until the
2.0.0 full release is ready, we may add some enhancements and they will appear in minor
releases.

Once the Pekko 2.0.0 full release is done, we will end active development in 1.x and only
important bug fixes including security fixes will appear in new 1.x releases.
Dependency upgrades will only be made for important bug fixes including security fixes.

With 1.x, changes will normally only be made to the most recent 1.x release and won't
generally be backported to previous 1.x minor versions.

We will announce an end of support date in due course.
