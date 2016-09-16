import scala.annotation.tailrec

object P05 {
  @tailrec
  def reverse[T](list: List[T], acc: List[T] = List()): List[T] = list match {
    case Nil => acc
    case h :: Nil => h :: acc
    case h :: t => reverse(t, h :: acc)
  }

  def example = {
    assert(reverse(List(1, 2, 3, 5, 8)) == List(8, 5, 3, 2, 1))
    assert(reverse(List("a", "b", "c")) == List("c", "b", "a"))
    assert(reverse(List(2)) == List(2))
    assert(reverse(List()) == List())

    println("alles gut!")
  }
}
