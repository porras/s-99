import java.util.NoSuchElementException
import org.specs2.mutable.Specification

object P02Spec extends Specification {
  "penultimate" >> {
    P02.penultimate(List(1, 1, 2, 3, 5, 8)) ==== 5
    P02.penultimate(List("a", "b", "c")) ==== "b"

    def e = { P02.penultimate(List(1)) }
    e must throwA[NoSuchElementException]
  }
}
