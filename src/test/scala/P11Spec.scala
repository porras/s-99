import org.specs2.mutable.Specification

object P11Spec extends Specification {
  "encodeModified" >> {
    P11.encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  }
}
