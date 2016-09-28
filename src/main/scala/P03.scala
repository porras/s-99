import java.util.NoSuchElementException

import scala.annotation.tailrec

object P03 {
  @tailrec
  def nth[T](n: Int, list: List[T]): T = (n, list) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, h :: _) => h
    case (_, _ :: tail) => nth(n - 1, tail)
  }
}
