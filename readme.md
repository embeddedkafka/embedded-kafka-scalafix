# Scalafix rules for Embedded Kafka

Scalafix rule to help `embedded-kafka` users update every import statement to the new package name.

## How to use

* In your `build.sbt` file add the following scalafix dependency (replace `x.x.x` with the appropriate version): `ThisBuild / scalafixDependencies += "io.github.embeddedkafka" %% "scalafix" % "x.x.x"`
* In your `.scalafix.fmt` file add the following rule:

```
rules = [
  EmbeddedKafka
]
```

* Run `scalafix` command from sbt.
