// interfaces = simmilar to classes except when they have functions, they dont have bodies to them.
// name + parameter + return type | without curly braces

// INTERFACE = to give class a function from the interface

// extend PersonIntyerface
class Person(): PersonInterface {
    override fun walk() {
        println("walking...")
    }

    override fun talk() {
        println("talking...")
    }

    var name: String = ""
    var age: Int = 72
    var weight: Int = 60

}