# incubator-pekko-site

## Status

This repo is used to publish the home page of the [Apache Pekko website](https://pekko.apache.org). 

Anyone looking to help improve our module specific docs should look at the Git repos
(eg [incubator-pekko](https://github.com/apache/incubator-pekko)) for the modules.

There are some details about how to deploy the pages associated with this repo in the
[wiki](https://github.com/apache/incubator-pekko-site/wiki/Manual-Publishing).

## Build

The site is built using [Paradox](https://developer.lightbend.com/docs/paradox/current/).

To build the site locally, run:

```
sbt paradox
```

To browse the site locally, run:

```
sbt paradoxBrowse
```

** Note that the `content` folder needs to be updated manually with the latest output in the `target/paradox/site/main` folder. **