/* string to upper case */
def toUpper (str: String): String = str.toUpperCase();

/* string to lower case */
def toLower (str: String): String = str.toLowerCase();

/* format function */
def formatNames(name: String)(func: String => String): String = func(name)


@main def init = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach(name => {
        println (
            formatNames(name) { str =>
                if (str.length % 2 == 0) {
                    toLower(str)
                } else {
                    toUpper(str)
                }
            }
        )
    })
}