package Unidad_3

fun main() {
    val asignaturas: MutableList<String> = mutableListOf("Matematicas", "Historia", "Lengua", "Química", "Física")
    val asignaturasARetirar = mutableListOf<String>()

    for (asignatura in asignaturas.toList()) {
        println("¿Qué nota ha sacado en $asignatura?")
        val nota: Double = readLine()?.toDoubleOrNull() ?: 0.0

        if (nota >= 5.0) {
            asignaturasARetirar.add(asignatura)
        } else {
            println("Suspendiste $asignatura")
        }
    }

    asignaturas.removeAll(asignaturasARetirar)

    println("Asignaturas a repetir: $asignaturas")
}