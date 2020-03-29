fun main(){
    println("Insira um valor de 4 digitos:")
    var valor = readLine()!!.toInt()
    var num1 = valor/100
    var num2 = (valor%1000)%100
    println("Primeira Dezena = $num1 \n Segunda Dezena = $num2")
}