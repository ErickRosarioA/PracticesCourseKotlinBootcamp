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