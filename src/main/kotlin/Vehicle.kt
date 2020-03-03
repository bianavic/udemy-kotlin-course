// when you OPEN a class it is able to be EXTENDED
open class Vehicle: Machine() {
    fun makeNoise(): String {
        return "Vruuuuuummmmm"
    }
}