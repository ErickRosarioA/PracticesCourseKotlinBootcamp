package org.example

fun main() {

    val game = Game()

    while (true) {
        print("Ingrese la dirección deseada: n/s/e/w: ")
        val input = readLine()
        game.makeMove(input)
    }


//    val game = Game()
//
//     Imprimir el camino inicial
//    println(game.path)
//
//     Invocar las lambdas para mover en diferentes direcciones
//    game.north()
//    game.east()
//    game.south()
//    game.west()
//    game.end()
//
//    Imprimir el camino después de terminar el juego
//    println(game.path)


}