/* check if odd or even */
def checkIfOddOrEven (num: Int): String = {
   num match {
        case num if (num <= 0) =>
            "Negative/Zero"
        case num if (num % 2 == 0) =>
            "Even number is given"
        case _ =>
            "Odd number is given"
    } 
}

@main def init = {
    print("Enter integer number: ")
    println(checkIfOddOrEven(scala.io.StdIn.readInt()))
}