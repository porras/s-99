import scala.annotation.tailrec

object P10 {
  // TODO: use P04.length (instead of stdlib's .size) and P09.pack (instead of copying and pasting it here)
  def encode[T](list: List[T]): List[(Int, T)] = pack(list).map(x => (x.size, x.head))

  @tailrec
  private def pack[T](list: List[T], current: List[T] = List(), result: List[List[T]] = List.empty): List[List[T]] = (list, current) match {
    case (h :: t, Nil) => pack(t, List(h), result)
    case (h :: t, c :: _) if h == c => pack(t, c :: current, result)
    case (h :: t, c :: _) => pack(t, List(h), current :: result)
    case (Nil, current) => (current :: result).reverse
  }

  def example = {
    assert(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))

    println("alles gut!")
  }
}
