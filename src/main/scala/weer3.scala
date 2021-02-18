import scala.util.control.Breaks._

object week3 extends App{

  def kidsWithCandies(candies: Array[Int], extra: Int): Array[Boolean] = {
    var maximum: Int = candies.max

    return for {
      candy <- candies

      val ans = if (candy + extra >= maximum) true else false
    } yield ans
  }
  //kidsWithCandies(Array(12, 1, 12), 10)

  def smallerNumbers(numbers: Array[Int]): Unit = {
    var amount: Array[Int] = Array.fill[Int](numbers.length)(0)

    for (i <- 0 until numbers.length; j <- 1 until numbers.length) {
      if (numbers(i) > numbers(j))
        amount(i) += 1
    }
    amount.foreach(print)
    return for (i <- amount)
      println(i)
  }
  //smallerNumbers(Array(8, 1, 2, 3, 4))

  def repeatedElement(elements: Array[Int]): Int ={
    var sum = 0
    val elements_set = elements.toSet

    for (i <- elements) {
      sum += i
    }
    for (i <- elements_set) {
      sum -= i
    }

    var rep_elem = sum / (elements.length / 2 - 1)

    println(rep_elem)
    return (rep_elem)
  }
  //repeatedElement(Array(2, 1, 2, 5, 3, 2))

  def unique(n: Int): Unit ={
    var ans: Array[Int] = Array.fill[Int](n)(0)

    for (i <-1 until (n/2 + 1)){
      ans(n - i) = -i
      ans(i) = i
  }
    if (n % 2 != 0) {
    ans(0) = 0}

    ans.foreach(print)
    println()
    for (i <- ans)
      println(i)
  }
  //unique(5)

  def intersection(arr1: Array[Int], arr2: Array[Int]): Unit = {
    var int: Array[Int] = arr1.intersect(arr2)

    for (i <- int) {
      print(i + " ")
    }
  }
  intersection(Array(1, 2, 2, 3, 1), Array(2, 2, 4, 3))

  def build(target: Array[Int], n: Int): List[String] = {
    var cnt: Int = 0
    var ans: List[String] = List[String]()

    breakable {
      for (i <- 1 to n) {
        if (cnt == target.length) {
          break
        }
        if (target(cnt) == i) {
          ans :+= "Push"
          cnt += 1
        }
        else {
          ans :+= "Push"
          ans :+= "Pop"
        }
      }
    }
    ans
    //for (i <- ans) {
     // print(i + " ")
    //}
 }
  println(build(Array(1, 3), 3))

  def decompress(nums: Array[Int]): Array[Int] = {
    var ans: Array[Int] = Array.fill[Int](nums(0))(nums(1))

    for (i <- 1 until nums.length / 2) {
      ans = ans ++: Array.fill[Int](nums(2 * i))(nums(2 * i + 1))
    }
    ans
  }
}