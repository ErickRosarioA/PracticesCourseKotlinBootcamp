package org.example

class Book(val title: String, val author: String, val year: Int) {

    // Método que devuelve el título y el autor como un Pair
    fun getTitleAuthor(): Pair<String, String> {
        return title to author
    }

    // Método que devuelve el título, el autor y el año como un Triple
    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}