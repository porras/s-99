object P07 {
  def flatten(list: List[Any]): List[Any] = list match {
    case (l : List[Any]) :: t => flatten(l ++ t)
    case h :: t => h :: flatten(t)
    case Nil => Nil
  }
}
