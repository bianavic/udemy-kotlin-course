// Car is a CHILD class, that's why we are extending the vehicle
class Car(carNameParam: String, vinNumber: Int): Vehicle() { // creating a CONSTRUCTOR with ()
    var carName = carNameParam // VARIAVEL GLOBAL == pertence a uma CLASS LEVEL
    var vinNumber = vinNumber

    fun showVinNumber(): Int {
        // permitimos que vejamos vinNumber desta funcao,
        // mas agora retorna o VALOR ao inves da VARIAVEL
        // esta é a unica forma de acessar a funcao
        return vinNumber
    }
}