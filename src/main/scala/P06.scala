import scala.annotation.tailrec

object P06 {
  @tailrec
  def isPalindrome[T](list: List[T]): Boolean = list match {
    case Nil => true
    case _ :: Nil => true
    case first :: (l :+ last) if first == last => isPalindrome(l)
    case _ => false
  }
}
