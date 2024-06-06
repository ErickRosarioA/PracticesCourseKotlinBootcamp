package org.example

// Función main para crear una instancia de Book y mostrar la información
fun main() {
    // Crear una instancia de Book
    val book = Book("Romeo and Juliet", "William Shakespeare", 1597)

    // Verificar si el usuario puede pedir prestado otro libro
    val canBorrow = book.canBorrow(3) // Suponiendo que el usuario ha pedido prestado 3 libros
    println("Can borrow more books: $canBorrow")

    // Imprimir la URL del libro
    book.printUrl()

    // Obtener el título y el autor como un Pair
    val bookTitleAuthor = book.getTitleAuthor()

    // Obtener el título, el autor y el año como un Triple
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    // Imprimir la información del libro utilizando el Pair
    println("Here is your book '${bookTitleAuthor.first}' written by ${bookTitleAuthor.second}.")

    // Imprimir la información del libro utilizando el Triple
    println("Here is your book '${bookTitleAuthorYear.first}' written by ${bookTitleAuthorYear.second} in ${bookTitleAuthorYear.third}.")
}