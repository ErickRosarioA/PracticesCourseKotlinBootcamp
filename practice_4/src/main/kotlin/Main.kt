package org.example

// Definir la clase SimpleSpice
class SimpleSpice {
    // Propiedades para el nombre y el nivel de picante
    var name: String = "curry"
    var spiciness: String = "mild"

    // Propiedad heat que devuelve un valor numérico basado en el nivel de picante
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            else -> 0
        }
}

fun main() {
    // Crear una instancia de SimpleSpice
    val spice = SimpleSpice()

    // Imprimir el nombre y el valor de heat de la especia
    println("Nombre de la especia: ${spice.name}")
    println("Nivel de picante (heat): ${spice.heat}")
}