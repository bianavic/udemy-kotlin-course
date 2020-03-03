// Car is a CHILD class, that's why we are extending the vehicle
class Car: Vehicle() {
    var carName = "Toyota" // VARIAVEL GLOBAL == pertence a uma CLASS LEVEL
    private var vinNumber = 1234

    fun showVinNumber(): Int {
        // permitimos que vejamos vinNumber desta funcao,
        // mas agora retorna o VALOR ao inves da VARIAVEL
        // esta é a unica forma de acessar a funcao
        return vinNumber
    }
}