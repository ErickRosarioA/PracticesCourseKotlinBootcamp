package org.example

import java.util.Calendar

fun main() {
    println("Hello, World!")
    dayOfWeek() // Llamada a la función dayOfWeek() desde main()
}

fun dayOfWeek() {
    println("What day is it today?")

    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    val dayString = when (day) {
        Calendar.SUNDAY -> "Sunday"
        Calendar.MONDAY -> "Monday"
        Calendar.TUESDAY -> "Tuesday"
        Calendar.WEDNESDAY -> "Wednesday"
        Calendar.THURSDAY -> "Thursday"
        Calendar.FRIDAY -> "Friday"
        Calendar.SATURDAY -> "Saturday"
        else -> "Unknown day"
    }

    println("Today is $dayString")
}
