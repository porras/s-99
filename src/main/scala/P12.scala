import scala.annotation.tailrec

object P12 {
  @tailrec
  def decode[T](encodedList: List[(Int, T)], decodedList: List[T] = List()): List[T] = encodedList match {
    case (1, x) :: t => decode(t, x :: decodedList)
    case (i, x) :: t => decode((i - 1, x) :: t, x :: decodedList)
    case List() => P05.reverse(decodedList)
  }
}
