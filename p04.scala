import scala.annotation.tailrec

object P04 {
  @tailrec
  def length[T](list: List[T], acc : Int = 0): Int = list match {
    case List() => acc
    case _ :: t => length(t, acc + 1)
  }

  def example = {
    println(length(List(1, 2, 3, 5, 8)))
    println(length(List("a", "b", "c")))
    println(length(List()))
  }
}
