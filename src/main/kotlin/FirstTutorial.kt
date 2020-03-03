fun main(args: Array<String>) {
    val person1 = Person()
    person1.name = "Ted"

    val person2 = Person()
    person2.name = "Ed"

    println("Person1 ${person1.name}")
    println("Person2 ${person2.name}")

    val newPerson = Person()
    println("newPerson: " + newPerson.name)

    SingletonPerson.name = "Ted"

    println("singletonPerson: " + SingletonPerson.name)

}
