package org.example

fun main() {
    // Crear una instancia de Book
    val physicalBook = Book("El Quijote", "Miguel de Cervantes")
    physicalBook.readPage()
    println("Página actual del libro físico: ${physicalBook.getCurrentPage()}")

    // Crear una instancia de eBook
    val digitalBook = EBook("El camino al exito", "Erick Rosario")
    digitalBook.readPage()
    println("Conteo de palabras del eBook: ${digitalBook.getWordCount()}")
}
