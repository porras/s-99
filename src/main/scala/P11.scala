object P11 {
  def encodeModified[T](list: List[T]): List[Any] = P09.pack(list).map {
    case onlyItem :: Nil => onlyItem
    case h :: t => (P04.length(t) + 1, h)
  }
}
