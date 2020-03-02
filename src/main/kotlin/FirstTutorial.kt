fun main(args: Array<String>) {
    // lists are only readble. cant add, neither delete...
//    val bestFriends = listOf<String>("Ryan", "Ted", "Jan", "Dylan")
//    for(friend in bestFriends) {
//        println(friend)

    // array lists
//    val bestFriends = arrayListOf<String>("Ryan", "Ted", "Jan", "Dylan")
//    // bestFriends.add("Mike") // add to the end / this appends
//    bestFriends.add(1, "Mike") // add this to a index / it is pushed to first index
//    for(friend in bestFriends) {
//        println(friend)
//    }

    val bestFriends = arrayListOf<String>("Ryan")
    println("Who is your best friend?")

    val bestFriendInput = readLine()
    bestFriends.add(bestFriendInput!!)
    for(friend in bestFriends) {
        println(friend)
    }

}