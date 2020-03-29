import kotlin.math.sqrt

fun main(){
    println("Informe o valor de A:")
    var A = readLine()!!.toFloat()
    println("Informe o valor de B:")
    var B = readLine()!!.toFloat()
    println("Informe o valor de C:")
    var C = readLine()!!.toFloat()

    var DELTA = (B * B) - (4 * A * C)
    var x1 = (-B + sqrt(DELTA)) / (2*A)
    var x2 = (-B - sqrt(DELTA)) / (2*A)

    if(DELTA > 0){
        println("O valor de X1 é $x1 !")
        println("O valor de X2 é $x2 !")
    }else if(DELTA < 0){
        println("A equação não possui raizes reais!")
    }else{
        println("A equação possui apenas uma raiz sendo $x1 !")
    }
}
