package org.example

// Definir la clase Spice
class Spice(val name: String, val spiciness: String = "mild") {
    // Propiedad heat que devuelve un valor numérico basado en el nivel de picante
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    // Bloque init que imprime los valores del objeto después de su creación
    init {
        println("Spice creada: $name con nivel de picante: $spiciness (heat: $heat)")
    }
}

// Crear una función auxiliar para crear sal
fun makeSalt() = Spice("Salt")

fun main() {
    // Crear una lista de objetos Spice con diferentes niveles de picante
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "spicy"),
        Spice("red pepper", "very spicy")
    )

    // Filtrar la lista de especias para obtener las que son picantes o menos
    val mildAndSpicySpices = spices.filter { it.heat <= 10 }

    // Imprimir las especias filtradas
    println("Especias que son picantes o menos: ${mildAndSpicySpices.joinToString { it.name }}")

    // Crear sal usando la función auxiliar
    val salt = makeSalt()
    println("Sal creada: ${salt.name} con nivel de picante: ${salt.spiciness} (heat: ${salt.heat})")
}
