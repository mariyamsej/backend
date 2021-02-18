object Hello extends App {

  //println("Hello")
  //println(1 + 1)

  def e1(): Unit = {
    val x = 1
    var y = 1
    y = y * 3

    println("x = " + x)
    println(y + 5)
  }

  def e2(x: Double, y: Int): Double = x + y
  //println("e2: " + e2(1.05345, 2))

  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
  //println("e3: " + getSquareString(2.5))
  //e1()

  def e4(a: Int, b: Int): Int = {
    val x = if (a < b) a else b + 1
    x
  }
  //println("e4: " + e4(10,  3))

  def e5(x: Int): String ={
    x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "neither 1 nor 2"
    }
  }
  //println("e5: " + e5(10))

  def e6(a: Int, b: Int): Unit ={
    try {
      a/b
    }
    catch {
      case x: ArithmeticException =>
        {
          println("division by 0")
        }
    }
  }
  //e6(100, 0)

  def e7: Unit ={
    val fruits = List("apple", "banana", "lime", "orange")

    val fruitLengths = for {
      f <- fruits
      if f.length > 4
    } yield f.length

    println(fruitLengths)
  }
  //e7

  def e8(i: List[_]): Unit ={
    for (arg <- args) print(arg + " ")
    println()

    for (i <- 0 to 5) print(i + " ")
    println()

    for (i <- 0 to 10 by 2) print(i + " ")
    println()

    for (i <- 1 to 10 if i % 2 == 0) print(i + " ")
    println()
  }
  //e8(List(1, 2, 3, 4, 5, 6, 7))

  def e9(i: List[_]): Unit ={
    var res = for (a <- 1 to 10) yield a
    for (i <- res){
      println(i)
    }
  }
  e9(List(1, 2, 3))
}
