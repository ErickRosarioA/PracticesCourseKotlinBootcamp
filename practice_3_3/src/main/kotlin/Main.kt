package org.example

fun main() {
    println("¿Cómo te sientes hoy?")
    val mood = readLine()!!

    println(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(mood: String, weather: String = "soleado", temperature: Int = 24): String {
    return when {
        isHappyAndSunny(mood, weather) -> "sal a caminar"
        isSadAndRainyAndCold(mood, weather, temperature) -> "quédate en cama"
        isExcitedAndCloudyAndCool(mood, weather, temperature) -> "ve a correr"
        isBoredAndSunny(mood, weather) -> "sal a hacer deporte"
        isHot(temperature) -> "ve a nadar"
        else -> "Quédate en casa y descansa"
    }
}

fun isHappyAndSunny(mood: String, weather: String) = mood == "feliz" && weather == "soleado"
fun isSadAndRainyAndCold(mood: String, weather: String, temperature: Int) = mood == "triste" && weather == "lluvioso" && temperature == 0
fun isExcitedAndCloudyAndCool(mood: String, weather: String, temperature: Int) = mood == "emocionado" && weather == "nublado" && temperature < 20
fun isBoredAndSunny(mood: String, weather: String) = mood == "aburrido" && weather == "soleado"
fun isHot(temperature: Int) = temperature > 35