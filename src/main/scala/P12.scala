object P12 {
  def decode[T](encodedList: List[(Int, T)]): List[T] = {
    for {
      (n, c) <- encodedList
      _ <- 1 to n
    } yield c
  }
}
