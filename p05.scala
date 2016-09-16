object P05 {
  def reverse[T](list: List[T]): List[T] = list match {
    case List() => List()
    case h :: Nil => List(h)
    case h :: t => reverse(t) ::: List(h)
  }

  def example = {
    println(reverse(List(1, 2, 3, 5, 8)))
    println(reverse(List("a", "b", "c")))
    println(reverse(List()))
  }
}
