import scala.annotation.tailrec

object P04 {
  @tailrec
  def length[T](list: List[T], acc : Int = 0): Int = list match {
    case List() => acc
    case _ :: t => length(t, acc + 1)
  }
}
