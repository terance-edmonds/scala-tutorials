/* convert integer to character */
def toChar (i: Int) = i.toChar;

/* convert character to integer */
def toInt (c: Char) = c.toInt;

def shiftChar (c: Char, shifts: Int): Char = {
    if(shifts == 0) {
        return toChar(c)
    }
    else if(shifts > 0) {
        if(c.isUpper && toInt(c) + 1 > 90) {
            return shiftChar(toChar(65), shifts - 1)
        }
        else if(c.isLower && toInt(c) + 1 > 122) {
            return shiftChar(toChar(97), shifts - 1)
        }
        else {
            return shiftChar(toChar(toInt(c) + 1), shifts - 1)
        }
    }
    else {
        if(c.isUpper && toInt(c) - 1 < 65) {
            return shiftChar(toChar(90), shifts + 1)
        } 
        else if(c.isLower && toInt(c) - 1 < 97) {
            return shiftChar(toChar(122), shifts + 1)
        } 
        else {
            return shiftChar(toChar(toInt(c) - 1), shifts + 1)
        }
    }
}

/* encrypt with shifting */
def encrypt (str: String, key: Int): String = str.map(c => if(c.isLetter) shiftChar(c, key) else c)

/* decrypt with shifting */
def decrypt (str: String, key: Int): String = str.map(c => if(c.isLetter) shiftChar(c, -key) else c )

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