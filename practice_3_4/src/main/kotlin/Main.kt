package org.example

fun main() {
// Lista de especias
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")

// Filtrar y ordenar los currys por longitud de cadena
    val curriesSortedByLength = spices.filter { it.contains("curry") }.sortedBy { it.length }

// Mostrar los currys ordenados por longitud
    println("Currys ordenados por longitud: $curriesSortedByLength")

// Filtrar las especias que comienzan con 'c' y terminan con 'e' (primera forma)
    val spicesStartWithCAndEndsWithE1 = spices.filter { it.startsWith('c') && it.endsWith('e') }

// Filtrar las especias que comienzan con 'c' y terminan con 'e' (segunda forma)
    val spicesStartWithCAndEndsWithE2 = spices.filter { it.first() == 'c' && it.last() == 'e' }

// Mostrar las especias que cumplen la condición
    println("Especias que comienzan con 'c' y terminan con 'e' (forma 1): $spicesStartWithCAndEndsWithE1")
    println("Especias que comienzan con 'c' y terminan con 'e' (forma 2): $spicesStartWithCAndEndsWithE2")

// Tomar los primeros tres elementos de la lista y filtrar los que comienzan con 'c'
    val firstThreeStartingWithC = spices.take(3).filter { it.startsWith('c') }

// Mostrar los primeros tres elementos que comienzan con 'c'
    println("Los primeros tres elementos que comienzan con 'c': $firstThreeStartingWithC")

}