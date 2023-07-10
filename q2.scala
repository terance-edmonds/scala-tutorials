@main def init() = {
    val c = 35;

    /* calculate fahrenheit for given celsius */
    def calculateFahrenheit(celsius: Double): Double = celsius * 1.8 + 32;

    print(c + " Celsius in Fahrenheit is " + calculateFahrenheit(c));
}