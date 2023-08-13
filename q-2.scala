val getIntegerType = (num: Integer) => {
    if (num <= 0) "Negative/Zero"
    else if (num % 2 == 0) "Even number is given" 
    else "Odd number is given" 
}

@main def init = {
    /* get number from user */
    print("Enter integer number: ")
    val num: Integer = scala.io.StdIn.readInt();

    /* check integer type */
    print("Integer type: " + getIntegerType(num))
}