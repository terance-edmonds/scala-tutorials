/* check if number is even */
val isEven = (num: Int) => num % 2 == 0

/* filter even numbers */
val filterEvenNumbers = (nums: List[Int]) => nums.filter(isEven)

@main def init () = {
    print("Enter integer number list separated by comma: ")
    val string: String = scala.io.StdIn.readLine();
    val nums: List[Int] = string.split(",").map(_.trim.toInt).toList

    
    print("Even number List: " + filterEvenNumbers(nums).mkString(","))
}