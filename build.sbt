/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

enablePlugins(ParadoxPlugin, PekkoParadoxPlugin)

name := "pekko-site"

pekkoParadoxIncubatorNotice in Global := None

pekkoParadoxGithub := None

// disabled display versioning, in other words: hidden unnecessary version.
paradoxProperties += ("disabled.versioning.display" -> "true")

// By default any hidden files placed inside src/main/public are ignored
inConfig(Assets)(Seq(
  excludeFilter := excludeFilter.value -- ".htaccess"
))

lazy val animations = project.settings(
  scalaVersion := "3.4.1",
  libraryDependencies ++= Seq(
    "com.lihaoyi" %% "scalatags" % "0.13.1"
  )
)
