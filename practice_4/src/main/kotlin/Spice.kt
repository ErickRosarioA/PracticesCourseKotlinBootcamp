package org.example


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