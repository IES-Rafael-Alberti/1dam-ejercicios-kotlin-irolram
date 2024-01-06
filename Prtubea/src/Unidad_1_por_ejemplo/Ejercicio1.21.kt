package Unidad_1_por_ejemplo

fun main(){
    println("Introduce una frase: ")
    val frase:  String? = readLine()
    val invefrase = frase?.reversed()
    println("Su frase invertida es $invefrase")
}