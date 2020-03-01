fun main(args: Array<String>) { // type is string Array<String>

    println("What ice cream would you like?")
    val iceCream: String = readLine()!!

    if(iceCream == "Vanilla" || iceCream == "Banana") println("That'll be $1.20")
    else if(iceCream == "Chocolate" || iceCream == "Strawberry") {
        println("That'll be $2.00")
    } else if(iceCream == "Cherry") {
        println("That'll be $12.00!")
    }

}