package org.example

fun main() {
    repeat(10) {
        val fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        if (fortune == "Tómalo con calma y disfruta de la vida!") return
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    val birthday = getBirthday()
    return when {
        birthday == 28 || birthday == 31 -> "Tómalo con calma y disfruta de la vida."
        birthday in 1..7 -> "Sé humilde y todo saldrá bien."
        else -> fortunes[birthday % fortunes.size]
    }
}


//Elaborado por Erick Rosario