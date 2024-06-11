package org.example

//Aquí creamos una  función lambda para verificar divisibilidad por 3
val isDivisibleBy3: (Int) -> Boolean = { it % 3 == 0 }

//Aquí aplicamos el uso de las lambda
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val divisibleBy3 = numbers.filterDivisibleBy(3, isDivisibleBy3)
    println(divisibleBy3)  // Output: [3, 6, 9, 0]
}

//Aquí tenemos la extensión de función en List
fun List<Int>.filterDivisibleBy(divisor: Int, predicate: (Int) -> Boolean): List<Int> {
    val result = mutableListOf<Int>()
    for (item in this) {
        if (predicate(item)) {
            result.add(item)
        }
    }
    return result
}