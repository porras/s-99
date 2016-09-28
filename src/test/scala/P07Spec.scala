import org.specs2.mutable.Specification

object P07Spec extends Specification {
  "flatten" >> {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) ==== List(1, 1, 2, 3, 5, 8)
  }
}
