/* get number of string inputs */
def getInputCount (): Int = {
    print("Enter number of strings: ")
    return scala.io.StdIn.readInt();
}

/* get string input */
def getInput (): String = {
    print("Enter string: ")
    var str: String = scala.io.StdIn.readLine()

    if(str.length > 5) {
        return str;
    }

    return "";
}

/* add to array list */
def appendString (str: String, arrayList: Array[String], index: Int) = {
    arrayList(index) = str.toString()
}

/* get string length */
def getStringLength (str: String) = str.length;

/* display list */
def displayList(arrayList: Array[String]) = {
    println("\nStrings with length greater than 5")
    arrayList.foreach(i => if(getStringLength(i) > 5) println(i))
}

@main def init() = {
    var count: Int = 0;
    
    /* get count */
    count = getInputCount()
    var strings: Array[String] = new Array[String](count);
    
    /* get strings */
    for(i <- 0 to count - 1) {
        appendString(str = getInput(), arrayList = strings, index = i)
    }

    /* display the list */
    displayList(strings)
}