Hello world application for Spark
====

## Requirement

 * Apache Maven >= 3

## Build
```
$ git clone https://github.com/wtakase/spark-helloworld
$ cd spark-helloworld
$ mvn clean package
```

## Run
```
$ spark-submit --class jp.kek.spark.helloworld.HelloWorld target/helloworld-0.0.1-jar-with-dependencies.jar
Hello World!
```
