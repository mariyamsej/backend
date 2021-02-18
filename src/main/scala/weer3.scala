object kids_with_candies {
  def kidsWithCandies(candies: Array[Int], extra: Int): Array[Boolean] = {
    var maximum: Int = candies.max

    return for {
      candy <- candies

      val ans = if (candy + extra >= maximum) true else false
    } yield ans
  }
  kidsWithCandies(Array(1, 2, 3, 4, 5), 8)
}


object smaller_numbers {
  def smallerNumbers(numbers: Array[Int]): Array[Int] = {
    var amount: Array[Int] = Array.fill[Int](numbers.length)(0)

    for (i <- 0 until numbers.length; j <- 0 until numbers.length) {
      if (numbers(i) > numbers(j))
        amount(i) += 1
    }
    return amount
  }
  smallerNumbers(Array(8, 4, 3, 5))
}