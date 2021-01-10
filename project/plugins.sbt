resolvers += Resolver.sonatypeRepo("releases")

addSbtPlugin("ch.epfl.scala"     % "sbt-scalafix"   % "0.9.24")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"   % "2.4.2")
addSbtPlugin("com.github.gseitz" % "sbt-release"    % "1.0.13")
addSbtPlugin("com.geirsson"      % "sbt-ci-release" % "1.5.5")
