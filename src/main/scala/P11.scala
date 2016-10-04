object P11 {
  trait EncodedItem[T]
  case class One[T](x : T) extends EncodedItem[T]
  case class Multi[T](t : (Int, T)) extends EncodedItem[T]
  
  def encodeModified[T](list: List[T]): List[EncodedItem[T]] = P09.pack(list).map {
    case onlyItem :: Nil => One(onlyItem)
    case h :: t => Multi((P04.length(t) + 1, h))
  }
}
