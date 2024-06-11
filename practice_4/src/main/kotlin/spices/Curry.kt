package org.example.spices

class Curry(name: String, spiciness: String) : Spice(name, spiciness), Grinder {
    // Sobrescribir el método abstracto prepareSpice
    override fun prepareSpice() {
        println("Preparando la especia $name")
        grind()
    }

    // Implementar el método grind de la interfaz Grinder
    override fun grind() {
        println("Moliendo la especia $name en polvo")
    }
}