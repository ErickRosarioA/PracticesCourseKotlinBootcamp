package org.example.spices

data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}