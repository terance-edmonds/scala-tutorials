def isEven(n: Int): String = n match {
        /* check if number is negative */
        case n if (n < 0) => return "Negative";
        /* check if number is even by reducing it to 0 by subtracting the number by 2 */
        case n if (n == 0) => return "Even";
        /* check if number is even by reducing it to 1 by subtracting the number by 2 */
        case n if (n == 1) => return "Odd";
        /* subtracting the number by 2 */
        case _ => isEven(n - 2);
    }


@main def init = {
    println("3 is: " + isEven(3))
    println("6 is: " + isEven(6))
}