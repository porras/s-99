import org.specs2.mutable.Specification

object P04Spec extends Specification {
  "length" >> {
    P04.length(List(1, 2, 3, 5, 8)) ==== 5
    P04.length(List("a", "b", "c")) ==== 3
    P04.length(List()) ==== 0
  }
}
