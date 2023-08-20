/* initialize class */
class Rational(numerator: Int, denominator: Int) {
     require(denominator != 0, "Denominator cannot be zero")
     
     def neg: Rational = Rational(-numerator, denominator)

    /* override the default to string function */
     override def toString: String = numerator + "/" + denominator
}

@main def init = {
    val x = Rational(5, 6);

    println("Rational number: " + x)
    println("Negative Rational number: " + x.neg)
}