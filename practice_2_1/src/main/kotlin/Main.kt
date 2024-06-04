package org.example

import kotlin.math.pow

fun main() {
    val array = Array (7){1000.0.pow(it)}
    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte")
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }
}
//Este código está evaluando la respuesta al quiz para que valor asignar para arrojar el resultado correcto de los arrays and loops val array =  Array (7){1000.0.pow(it)}
//1 byte = 1 bytes
//1 kilobyte = 1000 bytes
//1 megabyte = 1000000 bytes
//1 gigabyte = 1000000000 bytes
//1 terabyte = 1000000000000 bytes
//1 petabyte = 1000000000000000 bytes
//1 exabyte = 1000000000000000000 bytes