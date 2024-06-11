package org.example

fun main() {
    // Crear un Set de títulos de libros de William Shakespeare
    val allBooks = setOf("Hamlet", "Romeo and Juliet", "Macbeth", "Othello")

    // Crear un Map que asocia el conjunto de libros al autor
    val library = mapOf("William Shakespeare" to allBooks)

    // Usar la función any() para ver si alguno de los libros es "Hamlet"
    val hasHamlet = library.any { it.value.contains("Hamlet") }
    println("Does the library have 'Hamlet'? $hasHamlet")

    // Crear un MutableMap y agregar un título/autor
    val moreBooks = mutableMapOf("J.K. Rowling" to "Harry Potter and the Philosopher's Stone")

    // Usar getOrPut() para ver si un título está en el mapa, y si no está, agregarlo
    moreBooks.getOrPut("J.R.R. Tolkien") { "The Hobbit" }
    moreBooks.getOrPut("J.K. Rowling") { "Harry Potter and the Chamber of Secrets" }

    // Imprimir el mapa de moreBooks
    println("More Books Library: $moreBooks")
}