object P01 {
  def last(list: List[Int]): Option[Int] = list match {
    case List() => None
    case l :: Nil => Some(l)
    case _ :: t => last(t)
  }

  def example = println(last(List(1, 1, 2, 3, 5, 8)))
}
