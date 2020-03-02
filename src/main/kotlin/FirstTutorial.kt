fun main(args: Array<String>) {
//    val names = listOf<String>("Ted", "Billy", "Ryan")
//    println("Hello, " + names[0])
//    println("Hello, " + names[1])
//    println("Hello, " + names[2])

    // for loop
    val names = listOf<String>("Ted", "Billy", "Ryan")
    var numOfTimesLooped = 0
    for(name in names) {
        println("Hello, " + name)
        println("Hello, " + numOfTimesLooped)
        numOfTimesLooped = numOfTimesLooped + 1
    }
}