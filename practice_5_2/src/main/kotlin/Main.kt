package org.example

fun main() {
    // Crear una instancia de Building usando Wood
    val woodBuilding = Building(Wood())
    woodBuilding.build()

    // Crear una instancia de Building usando Brick
    val brickBuilding = Building(Brick())
    brickBuilding.build()

    // Evaluar si los edificios son pequeños o grandes
    isSmallBuilding(woodBuilding)
    isSmallBuilding(brickBuilding)
}