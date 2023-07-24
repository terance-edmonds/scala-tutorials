/* convert integer to character */
def toChar (i: Int) = i.toChar;

/* convert character to integer */
def toInt (c: Char) = c.toInt;

/* encrypt with shifting */
def encrypt (str: String, key: Int): String = str.map(c => toChar(toInt(c) + key))

/* decrypt with shifting */
def decrypt (str: String, key: Int): String = str.map(c => toChar(toInt(c) - key))

@main def init () = {
    println("===== Ceasar Cipher =====");
    println("1. Encrypt string")
    println("2. Decrypt string")

    /* get option */
    print("Select option: ")
    val option: Int = scala.io.StdIn.readInt();
    
    if(option != 1 && option != 2) {
        println("Invalid option")
        System.exit(0)
    }

    /* get string and key value */
    println("Enter String: ")
    val str: String = scala.io.StdIn.readLine();
    println("Enter Key: ")
    val key: Int = scala.io.StdIn.readInt();

    println("String: " + str);
    println("Key: " + key + "\n")

    /* encrypt */
    if(option == 1) {
        println("Encrypted: ")
        println(encrypt(str, key));
    }
    
    /* decrypt */
    if(option == 2) {
        println("Decrypted: ")
        println(decrypt(str, key));
    }
}