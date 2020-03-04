class Bank() {
    var moneyInBank = 0.0

    fun deposit(amount: Double) {
        moneyInBank += amount
    }

    fun withdraw(amount: Double) {
        moneyInBank -= amount
    }
}