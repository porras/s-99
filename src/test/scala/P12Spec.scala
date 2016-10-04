import org.specs2.mutable.Specification

object P12Spec extends Specification {
  "decode" >> {
    P12.decode(List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))) ==== List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }
}
