class Account(id: Int, initial: Double = 0) {
    val accId = id;
    var balance = initial;

    def deposit(amount: Double, show: Boolean = true) = {
        if(show) println(s"Account $accId")
        
        if(amount <= 0) {
            println("deposit amount should be greater than zero")
        } else {
            balance = balance + amount

            if(show){
                println("deposit amount: " + amount);
                println("balance amount: " + balance);
            }
        }
    }
    
    def withdraw(amount: Double) = {
        println(s"Account $accId")
        if(amount > balance) {
            println("insufficient balance")
        } else {
            balance = balance - amount
            println("withdraw amount: " + amount);
            println("balance amount: " + balance);
        }
    }
    
    def transfer(amount: Double, acc: Account) = {
        println(s"Account $accId")
        if(amount > balance) {
            println("insufficient balance")
        } else {
            balance = balance - amount
            println("transfer amount: " + amount);
            println("balance amount: " + balance);

            acc.deposit(amount, false)
        }
    }

    def currentBalance() = {
        println(s"Account $accId balance")
        println("balance amount: " + balance)
    }
}

@main def init = {
    val acc1 = new Account(1)
    acc1.deposit(100)
    println("")

    /* withdraw */
    acc1.withdraw(20)
    println("")

    val acc2 = new Account(2)
    acc2.deposit(200)
    println("")

    /* transfer */
    acc2.transfer(40, acc1)
    println("")

    /* acc2 balance */
    acc1.currentBalance()
}