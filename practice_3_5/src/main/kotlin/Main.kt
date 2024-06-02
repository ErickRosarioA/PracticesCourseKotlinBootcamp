package org.example

fun main() {
// Definir la lambda para lanzar un dado
    val rollDice: (Int) -> Int = { sides ->
        if (sides > 0) (1..sides).random()
        else 0
    }

// Crear una nueva variable usando la notación de tipo de función
    val rollDice2: (Int) -> Int = { sides ->
        if (sides > 0) (1..sides).random()
        else 0
    }

// Probar la lambda con diferentes números de lados
    println("Lanzamiento de dado de 6 lados: ${rollDice(6)}")
    println("Lanzamiento de dado de 12 lados: ${rollDice(12)}")
    println("Lanzamiento de dado de 20 lados: ${rollDice(20)}")

// Probar la segunda lambda con diferentes números de lados
    println("Lanzamiento de dado de 8 lados (segunda lambda): ${rollDice2(8)}")
    println("Lanzamiento de dado de 10 lados (segunda lambda): ${rollDice2(10)}")


    // llamamos la función de gameplay
    gamePlay(rollDice2(4))
}

fun gamePlay(roll: Int) {
    val result = roll
    println("Resultado del lanzamiento: $result")
}
