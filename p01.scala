object P01 {
  def last[T](list: List[T]): Option[T] = list match {
    case List() => None
    case l :: Nil => Some(l)
    case _ :: t => last(t)
  }

  def example = {
    println(last(List(1, 1, 2, 3, 5, 8)))
    println(last(List("a", "b", "c")))
  }
}
