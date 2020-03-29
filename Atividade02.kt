fun main(){
    val notasAlunos2 : IntArray = intArrayOf(0,1,2)
    val pesos : IntArray = intArrayOf(0,1,2)
    pesos[0] = 2
    pesos[1] = 3
    pesos[2] = 5
    for(x in 0..2){
        println("Insira a ${x + 1} º nota")
        notasAlunos2[x] = readLine()!!.toInt()
    }
    var media = (((notasAlunos2[0]*pesos[0]) + (notasAlunos2[1]*pesos[1]) + (notasAlunos2[2]*pesos[2])) / (pesos[0] + pesos[1] + pesos[2]).toFloat())
    println("A média ponderada é: $media")
}