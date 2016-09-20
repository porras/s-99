object P07 {
  def flatten(list: List[Any]): List[Any] = list match {
    case (l : List[Any]) :: t => flatten(l ++ t)
    case h :: t => h :: flatten(t)
    case Nil => Nil
  }

  def example = {
    assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) == List(1, 1, 2, 3, 5, 8))

    println("alles gut!")
  }
}
