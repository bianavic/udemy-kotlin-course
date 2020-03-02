    fun main(args: Array<String>) {

        // while loop = when you dont know how many times to loop over
        // for loop = you know the number of elements because of the index
        val bestFriends = arrayListOf<String>("Ryan")
        var bestFriendInput: String = "Nothing"
        var deleteBestFriendInput: String = "Nothing"
        var optionPicked: String = "1"

        while(optionPicked != "3") {
            bestFriendInput = "Nothing"
            println("1. Add best friend")
            println("2. Delete best friend")
            println("3. Exit")
            optionPicked = readLine()!!

            if(optionPicked == "1") {
                while(bestFriendInput != "") {
                    println("Who is your best friend?: ")
                    bestFriendInput = readLine()!!
                    bestFriends.add(bestFriendInput)
            }

        } else if(optionPicked == "2") {
                print("What index isn't your best friend anymore?: ")
                deleteBestFriendInput = readLine()!!
                bestFriends.removeAt(deleteBestFriendInput.toInt())
        }
        for (friend in bestFriends) {
            println(friend)
        }
    }
}