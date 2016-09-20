import scala.annotation.tailrec

object P08 {
  @tailrec
  def compress(list: List[Any], acc: List[Any] = List()): List[Any] = list match {
    case Nil => acc
    case x :: y :: t if x == y => compress(x :: t, acc)
    case x :: t => compress(t, acc :+ x)
  }

  def example = {
    assert(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List('a, 'b, 'c, 'a, 'd, 'e))

    println("alles gut!")
  }
}
