import org.specs2.mutable.Specification

object P10Spec extends Specification {
  "encode" >> {
    P10.encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
