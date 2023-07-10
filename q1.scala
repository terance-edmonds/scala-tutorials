@main def init() = {
    val PI = 3.14;

    /* calculate area of a circle */    
    def calculateArea(radius: Double): Double = PI * Math.pow(radius, 2);

    print("Area of the circle with radius: " + 5 + " is " + calculateArea(5) + " units");
}