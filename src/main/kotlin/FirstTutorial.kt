fun main(args: Array<String>) { // type is string Array<String>

<<<<<<< HEAD
    println("What ice cream would you like?")
    val iceCream: String = readLine()!!

    if(iceCream == "Vanilla" || iceCream == "Banana") println("That'll be $1.20")
    else if(iceCream == "Chocolate" || iceCream == "Strawberry") {
        println("That'll be $2.00")
    } else if(iceCream == "Cherry") {
        println("That'll be $12.00!")
=======
/*    val name = "maria"
    val str = "hello $name"
    println(str)

    val number: int = 2
    val decimalnumber: double = 10.6
    val floatnumber: float = 10.6f

    val answerdouble: double = decimalnumber * 3
    val answerfloat: float = floatnumber * 3


    println("double: " + answerdouble)
    println("float: " +  answerfloat) */

    print("What is your level of pain between 1 and 3?")
    val number: Int = readLine()!!.toInt()

    if(number == 1){
        println("eh, you will be ok!")
    } else if(number == 2) {
        println("Are you ok?")
    } else if(number == 3) {
        println("you are dieing")
    } else{
        println("That is not between 1 and 3")
>>>>>>> 29eb46467d0f7862f35ad94ba9125866fa3f66ff
    }

}