package learn

object chapter5 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  Byte                                            //> res0: Byte.type = object scala.Byte
  Short                                           //> res1: Short.type = object scala.Short
  Int                                             //> res2: Int.type = object scala.Int
  Long                                            //> res3: Long.type = object scala.Long
  Char                                            //> res4: Char.type = object scala.Char
  Float                                           //> res5: Float.type = object scala.Float
  Double                                          //> res6: Double.type = object scala.Double
  Boolean                                         //> res7: Boolean.type = object scala.Boolean

  val hex = 0x5                                   //> hex  : Int = 5
  val hex2 = 0x00FF                               //> hex2  : Int = 255
  val magin = 0xcafebabe                          //> magin  : Int = -889275714

  val dec1 = 31                                   //> dec1  : Int = 31
  val dec2 = 35                                   //> dec2  : Int = 35
  val dec3 = 20                                   //> dec3  : Int = 20

  val prog = 0xCAFEBABEl                          //> prog  : Long = 3405691582
  val tower = 35l                                 //> tower  : Long = 35
  val of = 31l                                    //> of  : Long = 31

  val little: Short = 367                         //> little  : Short = 367
  val littler: Byte = 38                          //> littler  : Byte = 38

  val big = 1.2345                                //> big  : Double = 1.2345
  val bigger = 1.2345e1                           //> bigger  : Double = 12.345
  val biggerStill = 123e45d                       //> biggerStill  : Double = 1.23E47

  val littleF = 1.2345F                           //> littleF  : Float = 1.2345
  val littleBigger = 3e5f                         //> littleBigger  : Float = 300000.0

  val anotherDouble = 3e5                         //> anotherDouble  : Double = 300000.0
  val yetAnother = 3e5d                           //> yetAnother  : Double = 300000.0

  val a = 'A'                                     //> a  : Char = A
  val c = '\101'                                  //> c  : Char = A
  val d = '\u0041'                                //> d  : Char = A
  val f = '\u0044'                                //> f  : Char = D
  val B\u0041\u0044 = 1                           //> BAD  : Int = 1
  val backslash = '\\'                            //> backslash  : Char = \

  val hello = "hello"                             //> hello  : String = hello
  val escapes = "\\\"\'"                          //> escapes  : String = \"'
  println("""|Welcome to Ultamix 3000.
             |Type "HELP" for help.""".stripMargin)
                                                  //> Welcome to Ultamix 3000.
                                                  //| Type "HELP" for help.
  
  def updateRecordByNmuber(r: Symbol, value: Any) {}
                                                  //> updateRecordByNmuber: (r: Symbol, value: Any)Unit
  updateRecordByNmuber('name, "William")
  
 val sy = 'aSymbol                                //> sy  : Symbol = 'aSymbol
 sy.name                                          //> res8: String = aSymbol
  
  
  val bool = true                                 //> bool  : Boolean = true
  val fool = false                                //> fool  : Boolean = false
  
  val sum = 1 + 2                                 //> sum  : Int = 3
  val sum1 = 1.+(2)                               //> sum1  : Int = 3
  
  val s = "Hello, world!"                         //> s  : String = Hello, world!
  s indexOf 'o'                                   //> res9: Int = 4
  s indexOf ('o', 5)                              //> res10: Int = 8
 
  val nSeven = - 7                                //> nSeven  : Int = -7
  val anotherNSeven = 7.unary_-                   //> anotherNSeven  : Int = -7
  val lseven = 7 toLong                           //> lseven  : Long = 7
  
  
  21 + 2l                                         //> res11: Long(23L) = 23
  
  true && false                                   //> res12: Boolean(false) = false
  
  1 & 2                                           //> res13: Int(0) = 0
  1 | 2                                           //> res14: Int(3) = 3
  1 ^ 3                                           //> res15: Int(2) = 2
  ~1                                              //> res16: Int = -2
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}