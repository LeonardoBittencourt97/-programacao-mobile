import jdk.nashorn.api.tree.ReturnTree
import kotlin.system.exitProcess

class FunTriangulo(numAltura: Int){

    private var altura  = numAltura

    fun  MOSTRA(){
        for(x in 1..altura){
            for (y in 1..x){
                print("* ")
            }
            print("\n")
        }
    }
    init {
        if(altura <= 0 || altura > 20){
            println("Valores Errados")
            exitProcess(0)
        }
    }
}

fun main(){

    println("Informe a altura do triangulo")
    var altura = readLine()!!.toInt()
    FunTriangulo(altura).MOSTRA()
}