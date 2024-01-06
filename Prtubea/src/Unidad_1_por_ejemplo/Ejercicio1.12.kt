package Unidad_1_por_ejemplo

import java.lang.foreign.ValueLayout.OfFloat
fun main() {
    println("Escribe tu peso: ")
    val peso = readLine()?.toFloatOrNull() ?: 0f

    println("Escribe tu altura en centímetros: ")
    val alturaCentimetros = readLine()?.toFloatOrNull() ?: 0f
    val alturaMetros = alturaCentimetros / 100

    val imc: Float = peso / (alturaMetros * alturaMetros)

    println("Tu índice de masa corporal es: $imc")
}
