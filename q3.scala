@main def init() = {
    val PI = 3.14;

    /* calculate sphere volume */
    def calculateSphereVolume(radius: Double): Double = (4.0/ 3.0) * PI * Math.pow(radius, 3)

    print("Volume of the sphere with radius: " + 5 + " is " + calculateSphereVolume(5) + " units");
}