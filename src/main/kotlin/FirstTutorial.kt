fun main(args: Array<String>) {

    val person: Person = Person()
    println("beforeAction: ${person.action}")
    person.doAction(PersonAction.BIKING)
    println("afterAction: ${person.action}")

    if (person.action.equals(PersonAction.BIKING)) {
        println("Yayy I'm biking!")
    } else if(person.action.equals(PersonAction.WALK)) {
        println("Boo, I'm walking this is boring!")
    }
}
