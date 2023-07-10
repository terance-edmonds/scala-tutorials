@main def init() = {
    /* calculate time for distance */
    def calculateTimeForDistance(timePerKm: Double, distance: Double): Double = timePerKm * distance;

    /* calculate total time */
    def calculateTotalTime(easy_pase_time_1: Double, easy_pase_distance_1: Double, easy_pase_time_2: Double, easy_pase_distance_2: Double, tempo_time: Double, tempo_distance:Double): Double = calculateTimeForDistance(easy_pase_time_1, easy_pase_distance_1) + calculateTimeForDistance(tempo_time, tempo_distance) + calculateTimeForDistance(easy_pase_time_2, easy_pase_distance_2)

    print("Total time: " + calculateTotalTime(easy_pase_time_1 = 8.0, easy_pase_distance_1 = 2, easy_pase_time_2 = 8.0, easy_pase_distance_2 = 2, tempo_time = 7.0, tempo_distance = 3)  + " minutes")

}