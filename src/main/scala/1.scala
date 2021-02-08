object Hello extends App {

  println("Hello")

  def e1(): Unit = {
    val x = 1
    var y = 1
    y = y * 3

    println(x)
    println(y + 5)
  }

  def e2(x: Double, y: Int): Double = x + y
  println(e2(1.05345, 2))

  def getSquareString(input: Double): String = {
    val square = input * input
    square.toString
  }
  println(getSquareString(2.5))
  e1()

  def e4(a: Int, b: Int): Int = {
    val x = if (a < b) a else b + 1
    x
  }
  println(e4(10,  3))

  def e5
}

