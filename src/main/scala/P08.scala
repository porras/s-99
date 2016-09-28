import scala.annotation.tailrec

object P08 {
  @tailrec
  def compress(list: List[Any], acc: List[Any] = List()): List[Any] = list match {
    case Nil => acc
    case x :: y :: t if x == y => compress(x :: t, acc)
    case x :: t => compress(t, acc :+ x)
  }
}
