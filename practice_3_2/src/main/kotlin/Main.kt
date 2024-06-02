package org.example

fun main() {
    for (i in 1..10) {
        val birthday = getBirthday()
        val fortune = getFortuneCookie(birthday)
        println("Your fortune is: $fortune")
        if (fortune == "Take it easy and enjoy life!") break
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when {
        birthday == 28 || birthday == 31 -> "Tómalo con calma y disfruta de la vida."
        birthday in 1..7 -> "Sé humilde y todo saldrá bien."
        else -> fortunes[birthday % fortunes.size]
    }
}

//Elaborado por Erick Rosario