object P11 {
  trait EncodedItem[T] {
    def equals(o: T) = false
    def equals(o: (Int, T)) = false
  }

  case class One[T](x : T) extends EncodedItem[T] {
    override def equals(o: T) = x == o
  }

  case class Multi[T](t : (Int, T)) extends EncodedItem[T] {
    override def equals(o: (Int, T)) = t == o
  }

  def encodeModified[T](list: List[T]): List[EncodedItem[T]] = P09.pack(list).map {
    case onlyItem :: Nil => One(onlyItem)
    case h :: t => Multi((P04.length(t) + 1, h))
  }
}
