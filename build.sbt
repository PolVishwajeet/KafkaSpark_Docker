name := "KafkaSpark_Docker"

version := "0.1"

scalaVersion := "2.12.4"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.3"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.3"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.3" % "provided"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.4.3" % "provided"

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-10
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.3"


//scalaVersion := "2.11.12"
//
//// https://mvnrepository.com/artifact/org.apache.spark/spark-core
//libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.4"
//
//// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4"
//
//// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
//libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.4" % "provided"
//
//// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-10
//libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-10" % "2.4.4"
//
//// https://mvnrepository.com/artifact/org.apache.spark/spark-sql-kafka-0-10
//libraryDependencies += "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.4.4" % "provided"
//
//// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka-0-8
//libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka-0-8" % "2.4.4"
