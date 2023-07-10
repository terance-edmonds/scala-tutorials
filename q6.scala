/* recursive fibonacci */
def fibonacci(n: Int): Int = {
    if(n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
}

/* print fibonacci numbers till n */
def printFibonacci(n: Int) = {
    for (i <- 0 until n)
        println(fibonacci(i))
}

@main def init = {
    println("fibonacci numbers till 10 are: ")
    printFibonacci(10)
}