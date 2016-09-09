import java.util.NoSuchElementException

object P02 {
  def penultimate[T](list: List[T]): T = list match {
    case p :: _ :: Nil => p
    case _ :: t => penultimate(t)
    case _ => throw new NoSuchElementException
  }

  def example = {
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
    println(penultimate(List("a", "b", "c")))
    println(penultimate(List(1)))
  }
}
