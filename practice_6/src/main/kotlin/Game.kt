package org.example

class Game {
    var path = mutableListOf(Direction.START)

    // Lambdas para mover en diferentes direcciones
    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }

    // Lambda para terminar el juego
    val end = {
        path.add(Direction.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}