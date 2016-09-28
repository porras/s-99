import org.specs2.mutable.Specification

object P08Spec extends Specification {
  "compress" >> {
    P08.compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ==== List('a, 'b, 'c, 'a, 'd, 'e)
  }
}
