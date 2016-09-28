import java.util.NoSuchElementException

import scala.annotation.tailrec

object P01 {
  @tailrec
  def last[T](list: List[T]): T = list match {
    case List() => throw new NoSuchElementException
    case l :: Nil => l
    case _ :: t => last(t)
  }
}
