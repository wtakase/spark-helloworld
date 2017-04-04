package jp.kek.spark.helloworld

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val sc = new SparkContext(new SparkConf().setAppName("Hello World"))
    println("Hello World!")
  }
}
