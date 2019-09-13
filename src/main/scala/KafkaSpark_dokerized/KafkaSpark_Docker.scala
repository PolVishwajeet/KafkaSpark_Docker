package KafkaSpark_dokerized

import org.apache.spark.sql.SparkSession

object KafkaSpark_Docker {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder
      .appName("KafkaSparkDockerTesting")
      //      .config("spark.master", "local")
      .getOrCreate()

    spark.sparkContext.setLogLevel("WARN")

    val df = spark
      .readStream
      .format("kafka")
      .option("kafka.bootstrap.servers", "localhost:9092")
      .option("subscribe", "test")
      .load()

    val query = df.writeStream
      .outputMode("append")
      .format("console")
      .start()
    query.awaitTermination()

  }
}
