import scala.math._

/* initialize class */
class Rational(numer: Int, denom: Int) {
    var numerator: Int = numer
    var denominator: Int = denom

    require(denominator != 0, "Denominator cannot be zero")

    private def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

    def sub(r: Rational): Rational = {
        val commonDenom = denominator * r.denominator
        val numer1 = numerator * r.denominator
        val numer2 = r.numerator * denominator
        val numer = numer1 - numer2
        val gcdVal = gcd(numer, commonDenom)

        Rational(numer / gcdVal, commonDenom / gcdVal)
    }

    /* override the default to string function */
    override def toString: String = numerator + "/" + denominator
}

@main def init = {
    val x = Rational(3, 8);
    val y = Rational(5, 8);
    val z = Rational(2, 7);

    println("Subtracted rational number: " + x.sub(y))
}