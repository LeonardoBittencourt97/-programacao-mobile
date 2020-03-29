fun main(){

    println("Informe a base do retangulo:")
    var base = readLine()!!.toFloat()
    println("Informe a altura do retangulo:")
    var altura = readLine()!!.toFloat()
    var perimetro = (base * 2) + (altura * 2)
    var area  = base * altura

    println("Area do retangulo: $area \nPerimetro do retangulo é: $perimetro")
}