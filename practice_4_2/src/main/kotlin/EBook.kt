package org.example


class EBook(title: String, author: String, val format: String = "text") : Book(title, author) {
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