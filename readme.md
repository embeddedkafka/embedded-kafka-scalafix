# Scalafix rules for Embedded Kafka

Scalafix rule to help `embedded-kafka` users update every import statement to the new package name.

## How to use

* Add Scalafix to your project following [the official docs](https://scalacenter.github.io/scalafix/docs/users/installation.html).
* In your `build.sbt` file add the following Scalafix dependency (replace `x.x.x` with the appropriate version): `ThisBuild / scalafixDependencies += "io.github.embeddedkafka" %% "scalafix" % "x.x.x"`
* In your `.scalafix.fmt` file add the following rule:

```
rules = [
  EmbeddedKafka
]
```

* Run `test/scalafix` command from sbt.
* Remove the rule and the dependency.
