import java.util.NoSuchElementException

object P01 {
  def last[T](list: List[T]): T = list match {
    case List() => throw new NoSuchElementException
    case l :: Nil => l
    case _ :: t => last(t)
  }

  def example = {
    println(last(List(1, 1, 2, 3, 5, 8)))
    println(last(List("a", "b", "c")))
    println(last(List()))
  }
}
