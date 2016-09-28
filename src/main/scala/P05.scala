import scala.annotation.tailrec

object P05 {
  @tailrec
  def reverse[T](list: List[T], acc: List[T] = List()): List[T] = list match {
    case Nil => acc
    case h :: Nil => h :: acc
    case h :: t => reverse(t, h :: acc)
  }
}
