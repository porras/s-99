import scala.annotation.tailrec

object P09 {
  @tailrec
  def pack[T](list: List[T], current: List[T] = List(), result: List[List[T]] = List.empty): List[List[T]] = (list, current) match {
    case (h :: t, Nil) => pack(t, List(h), result)
    case (h :: t, c :: _) if h == c => pack(t, c :: current, result)
    case (h :: t, c :: _) => pack(t, List(h), current :: result)
    case (Nil, current) => (current :: result).reverse
  }

  def example = {
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))

    println("alles gut!")
  }
}
