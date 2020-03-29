class Abajur {

    private var ligado: Boolean = false

    fun LIGA() {
        ligado = true
        print("O abajur foi ligado\n")
    }

    fun DESLIGA() {
        ligado = false
        print("O abajur foi DESLIGAdo\n")
    }
}

fun main(){

    var ABAJUR01 = Abajur().LIGA()
    ABAJUR01 = Abajur().DESLIGA()

    var ABAJUR02 = Abajur().LIGA()
    ABAJUR02 = Abajur().DESLIGA()
}
