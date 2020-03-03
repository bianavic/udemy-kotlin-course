    fun main(args: Array<String>) {
        displayGreeting()
        val name: String? = readLine()
        displayName(name)
}

    fun displayGreeting() {
        println("Hi, my name is Kotlin.")
        println("I'm a computer.")
        println("What's your name?")
    }

    fun displayName(name: String) {
        println("Your name is $name")

    }