import java.util.NoSuchElementException

import org.specs2.mutable.Specification

object P03Spec extends Specification {
  "nth" >> {
    P03.nth(0, List(1, 2, 3, 5, 8)) ==== 1
    P03.nth(1, List("a", "b", "c")) ==== "b"

    def e = { P03.nth(2, List(1)) }
    e must throwA[NoSuchElementException]
  }
}
