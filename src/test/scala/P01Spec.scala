import java.util.NoSuchElementException

import org.specs2.mutable.Specification

object P01Spec extends Specification {
  "last" >> {
    P01.last(List(1, 1, 2, 3, 5, 8)) ==== 8
    P01.last(List("a", "b", "c")) ==== "c"

    def e: List[Any] = { P01.last(List()) }
    e must throwA[NoSuchElementException]
  }
}
