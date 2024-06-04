package org.example

import org.example.spices.Curry
import org.example.spices.SpiceContainer


fun main() {
    // Crear una instancia de Curry
    val curry = Curry("Curry", "spicy")
    curry.prepareSpice()
    println("El color del curry es: ${curry.color}")


    val curry_2 = Curry("Curry", "spicy")
    val mildCurry_2 = Curry("Mild Curry", "mild")

    // Crear contenedores de especias
    val container1 = SpiceContainer(curry_2)
    val container2 = SpiceContainer(mildCurry_2)

    // Imprimir las etiquetas de los contenedores
    println("Etiqueta del contenedor 1: ${container1.label}")
    println("Etiqueta del contenedor 2: ${container2.label}")
}