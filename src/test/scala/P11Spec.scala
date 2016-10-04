import P11.{One, Multi}
import org.specs2.mutable.Specification

object P11Spec extends Specification {
  "encodeModified" >> {
    P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List(Multi((4,'a)), One('b), Multi((2,'c)), Multi((2,'a)), One('d), Multi((4,'e)))
  }
}
