## Micronaut 3.8.1 Documentation

- [User Guide](https://docs.micronaut.io/3.8.1/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.8.1/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.8.1/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Handler

[AWS Lambda Handler](https://docs.aws.amazon.com/lambda/latest/dg/java-handler.html)

Handler: io.micronaut.function.aws.proxy.MicronautLambdaHandler


- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature aws-lambda documentation

- [Micronaut AWS Lambda Function documentation](https://micronaut-projects.github.io/micronaut-aws/latest/guide/index.html#lambda)


## Basic Commands

### Create Project

```
mn create-app example.micronaut.micronautlambda --features=aws-lambda,graalvm --
build=gradle --lang=java
```

### Compile and build lambda package

```
./gradlew buildNativeLambda

```

### To Test
```
./gradlew test
```

