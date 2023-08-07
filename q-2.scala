/* square number */
val squareNum = (num: Int) => num * num

/* calculate square */
val calculateSquare = (nums: List[Int]) => nums.map(squareNum)

/* string list to number list */
val toNumList = (string: String) => string.split(",").map(_.trim.toInt).toList

@main def init () = {
    print("Enter integer number list separated by comma: ")
    val string: String = scala.io.StdIn.readLine();
    val nums: List[Int] = toNumList(string)

    print("Even number List: " + calculateSquare(nums).mkString(","))
}