import java.util.NoSuchElementException

import scala.annotation.tailrec

object P02 {
  @tailrec
  def penultimate[T](list: List[T]): T = list match {
    case p :: _ :: Nil => p
    case _ :: t => penultimate(t)
    case _ => throw new NoSuchElementException
  }
}
