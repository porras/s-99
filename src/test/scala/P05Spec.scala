import org.specs2.mutable.Specification

object P05Spec extends Specification {
  "reverse" >> {
    P05.reverse(List(1, 2, 3, 5, 8)) ==== List(8, 5, 3, 2, 1)
    P05.reverse(List("a", "b", "c")) ==== List("c", "b", "a")
    P05.reverse(List(2)) ==== List(2)
    P05.reverse(List()) ==== List()
  }
}
