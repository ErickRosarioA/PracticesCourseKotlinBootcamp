package org.example

import org.example.spices.Curry


fun main() {
    // Crear una instancia de Curry
    val curry = Curry("Curry", "spicy")
    curry.prepareSpice()
    println("El color del curry es: ${curry.color}")
}