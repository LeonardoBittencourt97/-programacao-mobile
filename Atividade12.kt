import jdk.nashorn.api.tree.ReturnTree
import kotlin.system.exitProcess

class FunRetangulo(numAltura: Int, numLargura: Int){

    private var altura  = numAltura
    private var largura = numLargura

    fun  MOSTRA(){
        for(x in 1..altura){
            for (y in 1..largura){
                print("* ")
            }
            print("\n")
        }
    }
    init {
        if((largura <= 0 || altura <= 0) || (largura > 20 || altura > 20)){
            println("Valores Errados")
            exitProcess(0)
        }
    }
}


fun main(){
    println("Altura do retangulo")
    var altura = readLine()!!.toInt()
    println("Largura do retangulo")
    var largura = readLine()!!.toInt()
    
    FunRetangulo(altura,largura).MOSTRA()
}