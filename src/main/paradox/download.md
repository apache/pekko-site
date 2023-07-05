# Download

This page is a placeholder. When we release Pekko 1.0.0, this page will include links for downloading
the official Source Release. It will also provide instructions on how to verify the downloaded files.

We will also publish jars to Maven Central and we expect that most users will use those for convenience.

We already publish snapshot jars to https://repository.apache.org/content/groups/snapshots/org/apache/pekko/.

## Verifying Downloads

It is highly recommended that you verify the files that you download.

We provide SHA digest files for all the files that we host on the download site. These files 
are named after the files they relate to but have `.sha512` extensions.

We also provide PGP signature files that can be verified using PGP or GPG. These files
are named after the files they relate to but have `.asc`.

To verify the SHA digests, use:
```
find . -name "*.sha512" -type f -execdir sha512sum -c {} \;
```

To verify the PGP signatures, you will need to get the KEYS file. This will be in the source archive
or can be fetched from https://github.com/apache/incubator-pekko/blob/main/KEYS.

```
gpg --import KEYS
```

To verify the download files, run:
```
find . -name "*.asc" -exec gpg --no-secmem-warning --verify {} \;
```
