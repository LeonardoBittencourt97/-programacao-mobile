fun main(){

    println("Palavra")
    var palavra = readLine()!!.toString()
    println("A palavra invertida é ${inverte(palavra)}")
}

fun inverte(text:String): String{
    return text.reversed()
}