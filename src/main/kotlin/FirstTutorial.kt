    fun main(args: Array<String>) {
        // criado 1 OBJETO car. estamos chamando a CLASSE CARRO, estamos criando um POINTER
        val car = Car("Ford", 1212) // o parenteses diz: me dë o carro e todos os seus parametros
        // CONSTRUCTOR == create a OBJECT that is a car and you pass in a default (TOYOTA), parameter,
        // like a FUNCTION or you pass it to the CLASS
        println("carName: " + car.carName) // chamando variaveis
        println("carName: " + car.vinNumber)
        println("carNoise: " + car.makeNoise()) // chamando funcoes
        car.doStuff()
        val tractor = Tractor()
        tractor.makeNoise()
        tractor.roamAroundCrops()
        tractor.doStuff()
}
