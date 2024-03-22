# Modules

* pekko (core) [docs](https://pekko.apache.org/docs/pekko/current/) [api](https://pekko.apache.org/api/pekko/current/) [japi](https://pekko.apache.org/japi/pekko/current/)
* pekko-http [docs](https://pekko.apache.org/docs/pekko-http/current/) [api](https://pekko.apache.org/api/pekko-http/current/) [japi](https://pekko.apache.org/japi/pekko-http/current/)
* pekko-grpc [docs](https://pekko.apache.org/docs/pekko-grpc/current/) [api](https://pekko.apache.org/api/pekko-grpc/current/)
* pekko-connectors [docs](https://pekko.apache.org/docs/pekko-connectors/current/) [api](https://pekko.apache.org/api/pekko-connectors/current/)
* pekko-connectors-kafka [docs](https://pekko.apache.org/docs/pekko-connectors-kafka/current/) [api](https://pekko.apache.org/api/pekko-connectors-kafka/current/)
* pekko-management [docs](https://pekko.apache.org/docs/pekko-management/current/) [api](https://pekko.apache.org/api/pekko-management/current/)
* pekko-persistence-cassandra [docs](https://pekko.apache.org/docs/pekko-persistence-cassandra/current/) [api](https://pekko.apache.org/api/pekko-persistence-cassandra/current/)
* pekko-persistence-dynamodb [GitHub](https://github.com/apache/pekko-persistence-dynamodb)
* pekko-persistence-jdbc [docs](https://pekko.apache.org/docs/pekko-persistence-jdbc/current/) [api](https://pekko.apache.org/api/pekko-persistence-jdbc/current/)
* pekko-persistence-r2dbc [docs](https://pekko.apache.org/docs/pekko-persistence-r2dbc/current/) [api](https://pekko.apache.org/api/pekko-persistence-r2dbc/current/)
* pekko-projection [docs](https://pekko.apache.org/docs/pekko-projection/current/) [api](https://pekko.apache.org/api/pekko-projection/current/)

We are still working on fixing up the docs for some Pekko modules. You might also want to look at the following repositories in GitHub.

## Repositories

The Apache Pekko project is broken into several repositories:

- [pekko](https://github.com/apache/pekko): contains the core Apache Pekko framework.
    - [pekko-samples](https://github.com/apache/pekko-samples): various samples
- [pekko-connectors](https://github.com/apache/pekko-connectors): contains connectors for other systems, such as Kafka, Cassandra, etc.
    - [pekko-connectors-kafka](https://github.com/apache/pekko-connectors-kafka): contains the Kafka connector.
    - [pekko-connectors-samples](https://github.com/apache/pekko-connectors-samples) (WIP): contains a sample connector.
- [pekko-grpc](https://github.com/apache/pekko-grpc): contains the gRPC server module.
- [pekko-http](https://github.com/apache/pekko-http): contains the HTTP server module.
- [pekko-management](https://github.com/apache/pekko-management): contains the tools for operating with Pekko clusters.
- [pekko-persistence-cassandra](https://github.com/apache/pekko-persistence-cassandra): contains the Cassandra persistence module.
- [pekko-persistence-dynamodb](https://github.com/apache/pekko-persistence-dynamodb): contains the [DynamoDB](https://aws.amazon.com/dynamodb/) persistence module.
- [pekko-persistence-jdbc](https://github.com/apache/pekko-persistence-jdbc): contains the JDBC persistence module.
- [pekko-persistence-r2dbc](https://github.com/apache/pekko-persistence-r2dbc): contains the R2DBC persistence module.
- [pekko-projection](https://github.com/apache/pekko-projection): contains the event sourcing and CQRS module.
- [pekko-platform-guide](https://github.com/apache/pekko-platform-guide) (WIP): contains a Microservice built with Pekko tooling.

In addition to the above, there are also the following QuickStart templates:

- [Quickstart (Scala)](https://github.com/apache/pekko-quickstart-scala.g8)
- [Quickstart (Java)](https://github.com/apache/pekko-quickstart-java.g8)
- [HTTP Quickstart (Scala)](https://github.com/apache/pekko-http-quickstart-scala.g8)
- [HTTP Quickstart (Java)](https://github.com/apache/pekko-http-quickstart-java.g8)
- [gRPC Quickstart (Scala)](https://github.com/apache/pekko-grpc-quickstart-scala.g8)
- [gRPC Quickstart (Java)](https://github.com/apache/pekko-grpc-quickstart-java.g8)

[pekko-sbt-paradox](https://github.com/apache/pekko-sbt-paradox) contains the documentation functions and theming for Pekko.
