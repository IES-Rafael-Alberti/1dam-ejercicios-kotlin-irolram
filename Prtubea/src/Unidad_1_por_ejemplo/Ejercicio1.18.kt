package Unidad_1_por_ejemplo

fun main(){

    println("Introduce su nombre: ")
    val nombre: String? = readLine()
    if(nombre != null){
        val nombreMinus = nombre.lowercase()
        val nombreMayus = nombre.uppercase()
        val nombreCap = nombre.split(" ").joinToString(" ") {it.replaceFirstChar { it.uppercase() }}
        println("Nombre en minusculas es $nombreMinus")
        println("Nombre en mayusculas es $nombreMayus")
        println("Nombre con una mayuscula es $nombreCap")
    }else {
        println("ERROR")
    }
}