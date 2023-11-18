#!/bin/bash

sbt paradox
rm -rf content
cp -r target/paradox/site/main content