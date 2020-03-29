fun main(){

    for(x in 0..100){
        println("Celsius = $x Fahrenheit = ${convercao(x.toFloat())}")
    }
}

fun convercao(celsius: Float): Float{

    return celsius * (9/5.toFloat()) + 32
}