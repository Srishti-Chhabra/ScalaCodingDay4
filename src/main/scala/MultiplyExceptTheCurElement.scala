class MultiplyExceptTheCurElement {
  def func(nums: List[Int]): List[Int] = {
    val product: Int = nums.reduce(_ * _)
    nums.map(x => product/x)
  }
}

object MultiplyExceptTheCurElement extends App{
  val multiplyExceptTheCurElement = new MultiplyExceptTheCurElement
  println(multiplyExceptTheCurElement.func(List(1, 2, 3, 4)))
}
