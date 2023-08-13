val calculateInterest = (amount: Double, interest: Double) => amount * interest; 
val getInterestRate = (amount: Double) => {
    amount match {
        case x if x <= 20000 => 0.02
        case x if x <= 200000 => 0.04
        case x if x <= 2000000 => 0.035
        case _ => 0.065
    }
}; 

@main def init = {
    /* get deposit amount from user */
    print("Enter deposit amount: ")
    val deposit: Double = scala.io.StdIn.readDouble();

    /* calculate interest */
    print("Interest amount: " + calculateInterest(deposit, getInterestRate(deposit)))
}