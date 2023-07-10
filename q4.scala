/* calculate attendance percentage */
def calculateAttendance (attendance: Int, attendanceVariance: Double): Int = (attendance + attendanceVariance).toInt

/* calculate total cost */
def calculateCost (attendance: Double, costPerAttendance: Double, costPerPerformance: Double): Double = (attendance * costPerAttendance) + costPerPerformance

/* calculate profit for a given scenario */
def calculateProfit(
    ticketPrice: Double,
    attendance: Int,
    costPerAttendance: Double,
    costPerPerformance: Double
) = (ticketPrice * attendance) - calculateCost(attendance, costPerAttendance, costPerPerformance)

/* find the best ticket price out of given set of details */
def findBestTicketPrice (data: List[Map[String, Double]]) = {
    var profits = data.map(
        x => 
        calculateProfit(
            ticketPrice = x("ticketPrice"),
            attendance = calculateAttendance(x("attendance").toInt, x("attendanceVariance")),
            costPerAttendance = x("costPerAttendance"),
            costPerPerformance = x("costPerPerformance")
        )
    )

    /* get the ticket price of the given index */
    data(
        /* find the index of max profit */
        profits.indexOf(
            profits.max // get the max profit
        )
    )("ticketPrice")
}

@main def init () = {
    println("Best ticket price is Rs." + 
        findBestTicketPrice(
            List(
                Map(
                    "ticketPrice" -> 5,
                    "attendance" -> 120,
                    "attendanceVariance" -> 10,
                    "costPerAttendance" -> 3,
                    "costPerPerformance" -> 500
                    ),
                Map(
                    "ticketPrice" -> 10,
                    "attendance" -> 120,
                    "attendanceVariance" -> 20,
                    "costPerAttendance" -> 3,
                    "costPerPerformance" -> 500
                    ),
                Map(
                    "ticketPrice" -> 15,
                    "attendance" -> 120,
                    "attendanceVariance" -> 0,
                    "costPerAttendance" -> 3,
                    "costPerPerformance" -> 500
                    ),
                Map(
                    "ticketPrice" -> 20,
                    "attendance" -> 120,
                    "attendanceVariance" -> -20,
                    "costPerAttendance" -> 3,
                    "costPerPerformance" -> 500
                    ),
                Map(
                    "ticketPrice" -> 25,
                    "attendance" -> 120,
                    "attendanceVariance" -> -40,
                    "costPerAttendance" -> 3,
                    "costPerPerformance" -> 500
                    ),
                Map(
                    "ticketPrice" -> 30,
                    "attendance" -> 120,
                    "attendanceVariance" -> -60,
                    "costPerAttendance" -> 3,
                    "costPerPerformance" -> 500
                    ),
                )
        )
    )
}
