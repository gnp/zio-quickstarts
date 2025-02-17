enablePlugins(ZioSbtEcosystemPlugin)

inThisBuild(
  List(
    name                       := "ZIO Quickstarts",
    organization               := "dev.zio",
    ciUpdateReadmeJobs         := Seq.empty,
    ciReleaseJobs              := Seq.empty,
    ciPostReleaseJobs          := Seq.empty,
    ciCheckWebsiteBuildProcess := Seq.empty,
    scalaVersion               := "2.13.8",
    ciTargetScalaVersions := makeTargetScalaMap(
      `zio-quickstart-encode-decode-json`
    ).value,
    ciDefaultTargetJavaVersions := Seq("8"),
    semanticdbEnabled           := true,
    semanticdbVersion           := scalafixSemanticdb.revision
  )
)

lazy val root =
  project
    .in(file("."))
    .aggregate(
      `zio-quickstart-hello-world`,
      `zio-quickstart-restful-webservice`,
      `zio-quickstart-restful-webservice-configurable-app`,
      `zio-quickstart-restful-webservice-custom-logger`,
      `zio-quickstart-restful-webservice-dockerize`,
      `zio-quickstart-restful-webservice-logging`,
      `zio-quickstart-restful-webservice-metrics`,
      `zio-quickstart-kafka`,
      `zio-quickstart-graphql-webservice`,
      `zio-quickstart-streams`,
      `zio-quickstart-encode-decode-json`
    )

lazy val `zio-quickstart-hello-world`                         = project
lazy val `zio-quickstart-restful-webservice`                  = project
lazy val `zio-quickstart-restful-webservice-configurable-app` = project
lazy val `zio-quickstart-restful-webservice-custom-logger`    = project
lazy val `zio-quickstart-restful-webservice-dockerize`        = project
lazy val `zio-quickstart-restful-webservice-logging`          = project
lazy val `zio-quickstart-restful-webservice-metrics`          = project
lazy val `zio-quickstart-kafka`                               = project
lazy val `zio-quickstart-graphql-webservice`                  = project
lazy val `zio-quickstart-streams`                             = project
lazy val `zio-quickstart-encode-decode-json`                  = project
