fun main(){

    println("Informe uma palavra para ver se ela é um palindromo:")
    var palavra1 : String = readLine().toString()
    var palavra2 = palavra1.reversed()

    if(palavra1.equals(palavra2)){
        print("$palavra1 é um Palindromo")
    }else{
        println("$palavra2 não é Palindromo")
    }
}