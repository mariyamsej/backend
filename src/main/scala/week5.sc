object week5{

  def maxProduct(nums: Array[Int]): Int = {
      nums.sorted.slice(nums.length - 2, nums.length).reduce((i, j) => (i - 1) * (j - 1))
  }

  def average(salary: Array[Int]): Double = {
    val sort_sal = salary.sortWith(_<_).slice(1, salary.length)
    def half_part(x: Int, n: Int): Double = x.toDouble / n

    def sum(f: (Int, Int) => Double, arr: Array[Int], i: Int, n: Int): Double =
      if (i >= n) 0
      else f(arr(i), n) + sum(f, arr, i + 1, n)

    sum(half_part, sort_sal, 0, salary.length - 2)
  }


}