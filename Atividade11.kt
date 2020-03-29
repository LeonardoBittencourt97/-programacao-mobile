class CC(nomeCliente: String,numeroAgencia: String,numeroConta: Int){

    private var cliente  = nomeCliente
    private var agencia  = numeroAgencia
    private var numConta = numeroConta
    private var saldo: Double = 0.0

    fun DEPOSITO(valor: Double): Double {
        saldo += valor
        return saldo
    }

    fun SAQUE(valor: Double): Double{
        saldo -= valor
        return saldo
    }

    fun TRANSFERENCIA(pConta: CC, pValor: Double){
        var conta: CC  = pConta
        conta.saldo += pValor
        saldo -= pValor
    }

    fun EXTRATO(){
        println("Cliente = $cliente")
        println("Agência = $agencia")
        println("Numero da conta = $numConta")
        println("Saldo = $saldo \n")
    }
}

fun main(){

    var CC01 = CC("Leonardo","4577",5689)
    CC01.DEPOSITO(7786.66)
    CC01.SAQUE(500.78)

    var CC02 = CC("Joana","1560",3456)
    CC02.DEPOSITO(9678.44)
    CC02.SAQUE(333.33)
    CC02.TRANSFERENCIA(CC01,100.0)

    var CC03 = CC("Beatriz","4566",6789)
    CC03.DEPOSITO(8235.22)
    CC03.SAQUE(789.56)
    CC03.TRANSFERENCIA(CC01,5000.0)

    CC01.EXTRATO()
    CC02.EXTRATO()
    CC03.EXTRATO()
}
