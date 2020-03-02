fun main(args: Array<String>) { // type is string Array<String>

    println("What ice cream would you like?")
    val iceCream: String = readLine()!!

    // use of WHEN =  only with equals, only 1 condition. (neither ||, neither >, <)
    when(iceCream) {
        "Vanilla" -> println("That'll be $1.20")
        "Chocolate" -> println("That'll be $2.00")
        "Cherry" -> println("That'll be $12.00!")
    }
}