package org.example


open class Book(val title: String, val author: String) {

    private var currentPage = 0

    // Método para leer una página, incrementando la página actual en 1
    open fun readPage() {
        currentPage++
    }

    // Método para obtener la página actual (opcional para verificación)
    fun getCurrentPage(): Int {
        return currentPage
    }
}

// Definir la subclase eBook que hereda de Book
class eBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    // Variable privada para almacenar el conteo de palabras
    private var wordCount = 0

    // Sobrescribir el método readPage para incrementar el conteo de palabras
    override fun readPage() {
        wordCount += 250
    }

    // Método para obtener el conteo de palabras (opcional para verificación)
    fun getWordCount(): Int {
        return wordCount
    }
}

fun main() {
    // Crear una instancia de Book
    val physicalBook = Book("El Quijote", "Miguel de Cervantes")
    physicalBook.readPage()
    println("Página actual del libro físico: ${physicalBook.getCurrentPage()}")

    // Crear una instancia de eBook
    val digitalBook = eBook("El camino al exito", "Erick Rosario")
    digitalBook.readPage()
    println("Conteo de palabras del eBook: ${digitalBook.getWordCount()}")
}
