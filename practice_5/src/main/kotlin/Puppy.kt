package org.example

import kotlin.random.Random

class Puppy {
    fun playWithBook(book: Book) {
        val tornPages = Random.nextInt(1, 10)
        book.tornPages(tornPages)
        println("The puppy tore $tornPages pages. Remaining pages: ${book.pages}")
    }
}