def evenSum(n: Int, x: Int = 2): Int = {
    n match {
        /* if x is larger than n or n is less than 2 return 0 */
        case n if (x >= n || n < 2) => return 0;
        /* add the current event number with next */
        case _ => x + evenSum(n, x + 2)
    }
}

@main def init = {
    println("addition of even numbers less than 10 is: " + evenSum(10))
}