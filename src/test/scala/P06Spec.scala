import org.specs2.mutable.Specification

object P06Spec extends Specification {
  "isPalindrome" >> {
    P06.isPalindrome(List()) must beTrue
    P06.isPalindrome(List(2)) must beTrue
    P06.isPalindrome(List(2, 2)) must beTrue
    P06.isPalindrome(List(1, 2, 3, 5, 8)) must beFalse
    P06.isPalindrome(List(1, 2, 3, 5, 8, 1)) must beFalse
    P06.isPalindrome(List(1, 2, 3, 2, 1)) must beTrue
    P06.isPalindrome(List(1, 2, 3, 3, 2, 1)) must beTrue
    P06.isPalindrome(List(1, 2, 2, 2, 1)) must beTrue
    P06.isPalindrome(List("a", "b", "c")) must beFalse
  }
}
