    fun main(args: Array<String>) {
        // criado 1 OBJETO car. estamos chamando a CLASSE CARRO, estamos criando um POINTER
        val car = Car() // o parenteses diz: me dë o carro e todos os seus parametros
        println("carName: " + car.carName) // chamando variaveis
        println("carNoise: " + car.makeNoise()) // chamando funcoes
}
