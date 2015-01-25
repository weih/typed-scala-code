package learn

import scala.collection.mutable.Set
import scala.collection.immutable.HashSet
import scala.io.Source

object learn {
  val args = Array("Scala", "is", "fun!")         //> args  : Array[String] = Array(Scala, is, fun!)

  def printArgs1(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }                                               //> printArgs1: (args: Array[String])Unit

  def printArgs2(args: Array[String]): Unit =
    for (arg <- args) println(arg)                //> printArgs2: (args: Array[String])Unit

  def printArgs3(args: Array[String]): Unit = {
    args.foreach(println)
  }                                               //> printArgs3: (args: Array[String])Unit

  def formatArgs(args: Array[String]) = args.mkString("\n")
                                                  //> formatArgs: (args: Array[String])String

  printArgs1(args)                                //> Scala
                                                  //| is
                                                  //| fun!
  printArgs2(args)                                //> Scala
                                                  //| is
                                                  //| fun!
  printArgs3(args)                                //> Scala
                                                  //| is
                                                  //| fun!
  val result = formatArgs(args)                   //> result  : String = Scala
                                                  //| is
                                                  //| fun!
  assert(result == "Scala\nis\nfun!")
}