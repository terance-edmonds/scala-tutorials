/* calculate interest */
def calculateInterest (amount: Double, interest: Double) = amount * interest / 100;

/* get interest rate */
def getInterestRate (amount : Double): Double = {
    amount match {
        case amount: Double if(amount <= 20000) => return 2
        case amount: Double if(amount <= 200000) => return 4
        case amount: Double if(amount <= 2000000) => return 3.5
        case _: Double => return 6.5
    }
}

@main def init = {
    print("Enter deposit amount: ")
    val amount: Double = scala.io.StdIn.readDouble();
    val interest_rate = getInterestRate(amount);

    print("Annual interest earned: " + calculateInterest(amount, getInterestRate(amount))) 
}