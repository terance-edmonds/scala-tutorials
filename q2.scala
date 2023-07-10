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

def primeSeq(n: Int): Unit = {
    /* if n is greater than 2 recursively find prime numbers */
    if(n > 2) primeSeq(n - 1)

    /* if the current number is prime print it */
    if(prime(n)) println(n);
}

@main def init = {
    println("prime numbers of 10: ")
    primeSeq(10)
}