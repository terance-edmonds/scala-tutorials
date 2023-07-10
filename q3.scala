/* calculate salary for hours at a given rate */
def calculateSalaryForHours(hours: Double, perHourRate: Double): Double = hours * perHourRate;

/* calculate salary for normal working hours and OT */
def calculateSalaryPerWeek(workingHours: Double, workingHoursRate: Double, otHours: Double, otHoursRate: Double): Double = calculateSalaryForHours(workingHours, workingHoursRate) + calculateSalaryForHours(otHours, otHoursRate);

/* calculate tax */
def calculateSalaryAfterTax(salary: Double, taxPercentage: Double): Double = salary - (salary * taxPercentage);

/* calculate salary for number of weeks */
def calculateSalaryForWeeks(workingHours: Double, workingHoursRate: Double, otHours: Double, otHoursRate: Double, weeks: Int):Double = calculateSalaryPerWeek(workingHours, workingHoursRate, otHours, otHoursRate) * weeks;

/* calculate take home salary */
def calculateTakeHomeSalary(workingHours: Double, workingHoursRate: Double, otHours: Double, otHoursRate: Double, taxPercentage: Double, weeks: Int): Double = calculateSalaryAfterTax(
    calculateSalaryForWeeks(workingHours, workingHoursRate, otHours, otHoursRate, weeks),
    taxPercentage
)

@main def init () = {

    println("- 40 working hours per week at a rate of Rs.250 per hour");
    println("- 30 OT hours per week at a rate of Rs.85 per hour");
    println("- 12% tax");
    println("Take home salary is: Rs." + calculateTakeHomeSalary(
        workingHours = 40,
        workingHoursRate = 250,
        otHours = 30,
        otHoursRate = 85,
        taxPercentage = 0.12,
        weeks = 4
    ))

}