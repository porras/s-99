import java.util.NoSuchElementException

import scala.annotation.tailrec

object P03 {
  @tailrec
  def nth[T](n: Int, list: List[T]): T = (n, list) match {
    case (_, Nil) => throw new NoSuchElementException
    case (0, h :: _) => h
    case (_, _ :: tail) => nth(n - 1, tail)
  }

  def example = {
    println(nth(0, List(1, 2, 3, 5, 8)))
    println(nth(1, List("a", "b", "c")))
    println(nth(2, List(1)))
  }
}
