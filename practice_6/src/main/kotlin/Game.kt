package org.example

class Game {
    var path = mutableListOf<Direction>(Direction.START)
    val location = Location(4, 4)

    val north: () -> Boolean = {
        path.add(Direction.NORTH)
        location.updateLocation(Direction.NORTH)
        println(location.getLocationDescription())
        true
    }

    val south: () -> Boolean = {
        path.add(Direction.SOUTH)
        location.updateLocation(Direction.SOUTH)
        println(location.getLocationDescription())
        true
    }

    val east: () -> Boolean = {
        path.add(Direction.EAST)
        location.updateLocation(Direction.EAST)
        println(location.getLocationDescription())
        true
    }

    val west: () -> Boolean = {
        path.add(Direction.WEST)
        location.updateLocation(Direction.WEST)
        println(location.getLocationDescription())
        true
    }

    val end: () -> Boolean = {
        path.add(Direction.END)
        println("Perdisteee!: $path")
        path.clear()
        false
    }

    fun move(where: () -> Boolean) {
        where.invoke()
    }

    fun makeMove(command: String?) {
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }
}