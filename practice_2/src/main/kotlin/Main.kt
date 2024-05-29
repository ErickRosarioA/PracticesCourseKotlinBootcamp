package org.example

fun main() {
    val welcomeMessage = "Hello and welcome to Kotlin"
    when (welcomeMessage.length) {
        0 -> println("Nothing to say?")
        in 1..50 -> println("Perfect")
        else -> println("Too long!")
    }
}
//La pregunta del cuestionario su respuesta es perfect