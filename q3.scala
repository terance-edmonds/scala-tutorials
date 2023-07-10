def sum(n: Int): Int = if(n == 0) 0 else n + sum(n - 1);

@main def init = {
    println("sum of numbers from 1 to 5: " + sum(5))
}