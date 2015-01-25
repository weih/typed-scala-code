package learn

object chapter6 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  class Rational(n: Int, d: Int) {
    require(d != 0)
    
    private val g = gcd(n.abs, d.abs)
    val numer: Int = n / g
    val denom: Int = d / g
    
    def this(n: Int) =
      this(n, 1)

    override def toString(): String =
      numer + "/" + denom

    def + (that: Rational): Rational =
      new Rational(numer * that.denom + that.numer * denom, denom * that.denom)
      
    def * (that: Rational): Rational =
      new Rational(numer * that.numer, denom * that.denom)
      
    def < (that: Rational) =
      numer * that.denom < that.numer * denom
      
    def max(that: Rational) =
      if(this < that) that else this
    
    private def gcd(a: Int, b: Int): Int =
      if(b == 0) a else gcd(b, a % b)
  }

  val a = new Rational(5, 10)                     //> a  : learn.chapter6.Rational = 1/2
  val b = new Rational(2, 3)                      //> b  : learn.chapter6.Rational = 2/3
  val c = new Rational(3)                         //> c  : learn.chapter6.Rational = 3/1
  
  a + b                                           //> res0: learn.chapter6.Rational = 7/6
  a < b                                           //> res1: Boolean = true
  a * b                                           //> res2: learn.chapter6.Rational = 1/3
  a max b                                         //> res3: learn.chapter6.Rational = 2/3

  //  val onHalf = new Rational(1, 2)
  //  val twoThirds = new Rational(2, 3)
  //  (oneHalf / 7) + (1 - twoThirds)
}