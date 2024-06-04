package org.example.spices

import org.example.spices.interfaces.SpiceColor

abstract class Spice(val name: String, val spiciness: String, color: SpiceColor = YellowSpiceColor) : SpiceColor by color {
    // Propiedad heat con un getter que devuelve un valor numérico basado en el nivel de picante
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    // Método abstracto prepareSpice
    abstract fun prepareSpice()
}