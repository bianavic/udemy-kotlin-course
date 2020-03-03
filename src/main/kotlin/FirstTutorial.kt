    fun main(args: Array<String>) {
        displayGreeting()
        val name: String? = readLine()
        val userGreeting: String = displayName(name)
        println(userGreeting)

        val answer = doComplexMathProblem(4, 5)
        println("answer: $answer")
}

    fun displayGreeting() {
        println("Hi, my name is Kotlin.")
        println("I'm a computer.")
        println("What's your name?")
    }

    fun displayName(name: String?): String {
        return "Your name is $name"
    }

    fun doComplexMathProblem(num1: Int, num2: Int): Int {
        return num1 + num2
    }