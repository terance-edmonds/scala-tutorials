/* check if number is prime */
val isPrime: Int => Boolean = num => {
  if (num <= 1) false
  else {
    var result = true
    var i = num - 1

    while (i > 1) {
        if(num % i == 0) {
            result = false
            i = 0
        } else {
            i = i - 1
        }
    }

    result
  }
}

/* filter prime */
val filterPrime = (nums: List[Int]) => nums.filter(isPrime)

/* string list to number list */
val toNumList = (string: String) => string.split(",").map(_.trim.toInt).toList

@main def init () = {
    print("Enter integer number list separated by comma: ")
    val string: String = scala.io.StdIn.readLine();
    val nums: List[Int] = toNumList(string)

    print("Even number List: " + filterPrime(nums).mkString(","))
}