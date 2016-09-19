import scala.annotation.tailrec

object P06 {
  @tailrec
  def isPalindrome[T](list: List[T]): Boolean = list match {
    case Nil => true
    case _ :: Nil => true
    case first :: (l :+ last) if first == last => isPalindrome(l)
    case _ => false
  }

  def example = {
    assert(isPalindrome(List()))
    assert(isPalindrome(List(2)))
    assert(isPalindrome(List(2, 2)))
    assert(!isPalindrome(List(1, 2, 3, 5, 8)))
    assert(!isPalindrome(List(1, 2, 3, 5, 8, 1)))
    assert(isPalindrome(List(1, 2, 3, 2, 1)))
    assert(isPalindrome(List(1, 2, 3, 3, 2, 1)))
    assert(isPalindrome(List(1, 2, 2, 2, 1)))
    assert(!isPalindrome(List("a", "b", "c")))

    println("alles gut!")
  }
}
