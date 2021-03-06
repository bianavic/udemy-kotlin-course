import java.util.*
import java.util.function.BiPredicate

val WITHDRAW = 1
val DEPOSIT = 2
val EXIT = 3
var usersChoice: Int = WITHDRAW

fun main(args: Array<String>) {
    val listOfPeople = mutableListOf("Ted", "Billy", "Ryan", "Sam")
    val grades = mutableListOf(70, 100, 40, 65, 70, 30, 40, 20, 10)
    val averageGrades = grades.average()
    println("averageGrades: $averageGrades")

//    println("Welcome to Ted's bank")
//    val bank: Bank = Bank()
//    doBankActionFromUserInput(bank)

}

fun doBankActionFromUserInput(bank: Bank) {
    while (usersChoice != EXIT) {
        greetUserWithChoices()
        displayAmountInBank(bank)
        usersChoice = readLine()!!.toInt()
        if(usersChoice == DEPOSIT) {
            val depositAmount = getDepositAmountFromUser()
            bank.deposit(depositAmount)
            println("Date: ${bank.getCurrentDate(System.currentTimeMillis())}")
        } else if (usersChoice == WITHDRAW) {
            val withdrawAmount = getWithdrawAmountFromUser()
            bank.withdraw(withdrawAmount)
        }
    }
}

    fun greetUserWithChoices() {
        println("Choose what you want. ")
        println("1: Withdraw")
        println("2: Deposit")
        println("3: Exit")
    }

    fun displayAmountInBank(bank: Bank) {
        println("Current amount of money is: ${bank.moneyInBank}")
    }

    fun getDepositAmountFromUser(): Double {
        print("How much would you like to deposit?")
        val depositAmount = readLine()!!.toDouble()
        return depositAmount
    }

    fun getWithdrawAmountFromUser(): Double {
        print("How much would you like to withdraw?")
        val withdrawAmount = readLine()!!.toDouble()
        return withdrawAmount
    }
