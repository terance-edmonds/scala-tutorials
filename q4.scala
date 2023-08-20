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

     def applyInterest() = {
        if (balance > 0) {
            /* deposit interest of 5% */
            balance += balance * 0.05
        } else if (balance < 0) {
            /* overdraft interest of 10% */
            balance += balance * 0.1 
        }
    }

    def currentBalance() = {
        println(s"Account $accId balance")
        println("balance amount: " + balance)
    }
}

/* accounts list */
val accounts = List(
  new Account(1, 1000.0),
  new Account(2, -500.0),
  new Account(3, 200.0)
)

/* bank */
object Bank {
  def getAccountsWithNegativeBalance(accounts: List[Account]): List[Account] = {
    accounts.filter(account => account.balance < 0)
  }

  def calculateTotalBalance(accounts: List[Account]): Double = {
    accounts.map(_.balance).sum
  }

  def applyInterest(accounts: List[Account]): Unit = {
    accounts.foreach(_.applyInterest())
  }
}

@main def init = {
    /* get accounts with negative balances */
    val negativeBalanceAccounts = Bank.getAccountsWithNegativeBalance(accounts)
    println("accounts with negative balances:")
    negativeBalanceAccounts.foreach(acc => acc.currentBalance())
    println("")

    /* calculate the total balance */
    val totalBalance = Bank.calculateTotalBalance(accounts)
    println(s"total balance of all accounts: $totalBalance")
    println("")

    /* apply interest to all accounts */
    Bank.applyInterest(accounts)
    println("balances after applying interest:")
    accounts.foreach(acc => acc.currentBalance())
}