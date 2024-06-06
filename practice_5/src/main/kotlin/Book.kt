package org.example

class Book(val title: String, val author: String, val year: Int) {

    // Método canBorrow() que devuelve true o false dependiendo de si un usuario ha alcanzado el número máximo de libros prestados
    fun canBorrow(currentlyBorrowed: Int): Boolean {
        return currentlyBorrowed < MAX_BORROWED_BOOKS
    }

    // Método printUrl() que crea e imprime una URL compuesta por BASE_URL, el título del libro y ".html"
    fun printUrl() {
        println("URL: ${Companion.BASE_URL}$title.html")
    }

    // Objeto complementario para definir la constante BASE_URL dentro de Book
    companion object {
        const val BASE_URL = "http://library.com/books/"
    }

    // Método que devuelve un Pair con el título y el autor
    fun getTitleAuthor(): Pair<String, String> {
        return title to author
    }

    // Método que devuelve un Triple con el título, el autor y el año
    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}