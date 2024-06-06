package org.example

// Función de extensión para calcular el peso del libro
fun Book.weight(): Double {
    return pages * 1.5
}

// Función de extensión para romper páginas del libro
fun Book.tornPages(torn: Int) {
    pages = if (pages - torn >= 0) pages - torn else 0
}