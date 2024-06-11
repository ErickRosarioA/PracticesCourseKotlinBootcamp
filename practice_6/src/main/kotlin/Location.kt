package org.example

import kotlin.math.absoluteValue

class Location(val width: Int, val height: Int) {
    val map = Array(width) { arrayOfNulls<String>(height) }
    var currentX = 0
    var currentY = 0

    init {
        // Inicializar el mapa con descripciones
        for (i in 0 until width) {
            for (j in 0 until height) {
                map[i][j] = "Ahora te encuentras ($i, $j)"
            }
        }
    }

    fun updateLocation(direction: Direction) {
        when (direction) {
            Direction.NORTH -> currentY = (currentY - 1).rem(height).absoluteValue
            Direction.SOUTH -> currentY = (currentY + 1).rem(height).absoluteValue
            Direction.EAST  -> currentX = (currentX + 1).rem(width).absoluteValue
            Direction.WEST  -> currentX = (currentX - 1).rem(width).absoluteValue
            else -> {}
        }
    }

    fun getLocationDescription(): String {
        return map[currentX][currentY] ?: "No se conoce tu ubicación"
    }
}