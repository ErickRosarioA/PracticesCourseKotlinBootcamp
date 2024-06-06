package org.example

// Clase genérica Building
class Building<out T : BaseBuildingMaterial>(private val buildingMaterial: T) {

    // Propiedad que define la cantidad base de materiales necesarios
    val baseMaterialsNeeded: Int = 100

    // Propiedad que calcula los materiales actuales necesarios
    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * buildingMaterial.numberNeeded

    // Método que imprime el tipo y la cantidad de materiales necesarios
    fun build() {
        println("${actualMaterialsNeeded} ${buildingMaterial::class.simpleName} required")
    }
}