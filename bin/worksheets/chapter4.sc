package learn

import scala.collection.mutable.Map

object chapter4 {
  println("Welcome to the Programming in Scala 2nd - Chapter 4 Classes and Objects")
                                                  //> Welcome to the Programming in Scala 2nd - Chapter 4 Classes and Objects

  class ChecksumAccumulator {
    private var sum = 0
    def add(b: Byte) { sum += b }
    def checksum(): Int = ~(sum & 0xFF) + 1
    override def toString: String = sum.toString
  }

  object ChecksumAccumulator {
    private val cache = Map[String, Int]()

    def calculate(s: String): Int =
      if (cache.contains(s))
        cache(s)
      else {
        val acc = new ChecksumAccumulator
        for (c <- s)
          acc.add(c.toByte)
        val cs = acc.checksum()
        cache += (s -> cs)
        cs
      }
  }
  
  ChecksumAccumulator.calculate("Every value is an object.")
                                                  //> res0: Int = -248

  val acc = new ChecksumAccumulator               //> acc  : learn.chapter4.ChecksumAccumulator = 0
  acc.add(10)
  acc.checksum                                    //> res1: Int = -10
  println(acc)                                    //> 10

  def f() = { "string" }                          //> f: ()String

  def g = { "string" }                            //> g: => String
  f                                               //> res2: String = string
  g                                               //> res3: String = string
}