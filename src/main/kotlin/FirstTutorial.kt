fun main(args: Array<String>) {
    val bestFriends = arrayListOf<String>("Ryan")
    var bestFriendInput: String = "Nothing"
    while(bestFriendInput != "") {

        println("Who is your best friend?: ")

        bestFriendInput= readLine()!!
        bestFriends.add(bestFriendInput)
        for(friend in bestFriends) {
            println(friend)
        }

    }
}