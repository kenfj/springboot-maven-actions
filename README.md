# Spring Boot Maven GitHub Actions

Spring Boot Maven GitHub Actions hello world example

## Version Check

```bash
java -version
# openjdk version "17.0.9" 2023-10-17 LTS
# OpenJDK Runtime Environment Corretto-17.0.9.8.1 (build 17.0.9+8-LTS)

mvn --version
# Apache Maven 3.9.4
```

## Quick Start

```bash
# run test
mvn test

# start server
mvn spring-boot:run

curl "http://localhost:8080/greeting?name=foo"

# Build an executable JAR
./mvnw clean package
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

## Setup Project from Initializr

* https://kazuhira-r.hatenablog.com/entry/2020/10/05/234759

```bash
curl -s https://start.spring.io | grep -B 1 -A 18 Parameter

curl https://start.spring.io/starter.zip \
    -d type=maven-project \
    -d dependencies=web,devtools \
    -o my-project.zip

unzip my-project.zip
```
