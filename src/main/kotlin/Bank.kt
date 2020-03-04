import java.text.SimpleDateFormat
import java.util.*
import java.util.logging.SimpleFormatter

class Bank() {
    var moneyInBank = 0.0

    fun deposit(amount: Double) {
        moneyInBank += amount
    }

    fun getCurrentDate(currentTimesInMilliseconds: Long): String {
        val date = Date(currentTimesInMilliseconds)
        val formatter = SimpleDateFormat("MMM/dd/y: h:mm:a")
        return formatter.format(date) // here its creating a date
    }

    fun withdraw(amount: Double) {
        moneyInBank -= amount
    }
}