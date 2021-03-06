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
  //intersection(Array(1, 2, 2, 3, 1), Array(2, 2, 4, 3))

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
  //println(build(Array(1, 3), 3))

  def decompress(nums: Array[Int]): Array[Int] = {
    var ans: Array[Int] = Array.fill[Int](nums(0))(nums(1))

    for (i <- 1 until nums.length / 2) {
      ans = ans ++: Array.fill[Int](nums(2 * i))(nums(2 * i + 1))
    }
    ans
  }

  def todecimal(head: List[Int]): Int = {
    var sz: Int = head.length
    var ans: Int = 0

    for (i <- head){
      ans += i * scala.math.pow(2, sz - 1).toInt
      sz -= 1
    }

    ans
  }
  println(todecimal(List(1, 0, 1, 1)))

  def weakest(mat: Array[Array[Int]], k: Int): Array[Int] = {
    var ans: Array[Int] = Array.fill[Int](k)(0)
    var cnt: Int = 0
    var j: Int = 0
    var mp: scala.collection.mutable.Map[Int, Array[Int]] = scala.collection.mutable.Map[Int, Array[Int]]()

    for (i <- 0 until mat.length) {
      mp(i) = mat(i)
    }

    breakable {
      while (j != mat(0).length) {
        for (i <- mp.keys) {
          if (mp(i)(j) == 0) {
            ans(cnt) = i
            cnt += 1
            mp remove i

            if (cnt == k) {
              break
            }
          }
        }
        j += 1
        if (cnt == k) {
          break
        }
      }
    }
    breakable {
      for (i <- mp.keys) {
        if (cnt != k) {
          ans(cnt) = i
          mp remove i
          cnt += 1
        }
        else {
          break
        }
      }
    }
    ans
  }

  def positive(z: Int, customfunction: CustomFunction): List[List[Int]] = {
    var ans: List[List[Int]] = List[List[Int]]()

    for (x <- 1 to 1000; y <- 1 to 1000) {
      val fxy = customfunction.f(x, y)
      if (fxy > z){
        y -= 1
      }
      else if (fxy < z){
        x += 1
      }
      else {
        ans = List(x, y) :: ans

      }
    }
    ans
  }
}