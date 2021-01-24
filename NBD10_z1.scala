object NBD10_z1 {
  def main(args: Array[String]): Unit = {
    def res(n: Int) = for {
      a <- 0 until n+1
      b <- 1 until a+1 if a % b  == 0
    } yield (a, b)
    val result = res(20)
    result.foreach(println)
  }
}
