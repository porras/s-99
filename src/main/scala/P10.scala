object P10 {
  def encode[T](list: List[T]): List[(Int, T)] = P09.pack(list).map(x => (P04.length(x), x.head))
}
