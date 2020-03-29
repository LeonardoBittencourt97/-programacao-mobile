fun main(){

    println("Informe um valor")
    var valor = readLine()!!.toFloat()
    println("O valor com sinal alterado é ${sinal(valor)}")
}

fun sinal(x:Float): Float {
    return  x * -1
}