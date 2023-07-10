/* get int from input */
def getInt (): Int = {
    print("Enter integer: ")
    return scala.io.StdIn.readInt();
}

/* round up to two decimals */
def getRounded(number: Float, round: Int = 2) = BigDecimal(number).setScale(round, BigDecimal.RoundingMode.HALF_UP)

/* calculate the mean */
def calculateMean (num1: Int, num2: Int): Float = ((num1 + num2).toFloat / 2)

/* get average of two integers */
def getMean (num1: Int, num2: Int): Float = getRounded(calculateMean(num1, num2)).toFloat


@main def int () = {
    println("Mean: " + getMean(
        getInt(),
        getInt()
    ))
}