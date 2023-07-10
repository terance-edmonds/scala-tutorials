def prime(n: Int, x: Int = 2): Boolean = {
  n match {
    /* check if n is less than or equal to 2 */
    case n if (n <= 2) => return n == 2;
    /* check if divisor is greater than n */
    case n if (x >= n) => return true;
    /* check if the remainder is 0 */
    case n if (n % x == 0) => return false;
    /* divide n by the next number */
    case _ => prime(n, x + 1)
  }
}

@main def init = {
  println("5 is a prime number? " + prime(5))
  println("8 is a prime number? " + prime(8))
}
