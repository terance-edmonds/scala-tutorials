def reverse (str: String): String = (for(i <- (str.length - 1) to 0 by -1) yield str(i)).mkString

@main def init () = {
    print("Enter String: ")
    val str = scala.io.StdIn.readLine();
    
    print("Reverse: " + reverse(str))
}