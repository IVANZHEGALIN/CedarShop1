package com.example.cedarshop.navigation

class Jackets(
    val seasonality: String,
    val material: String,
    val gender: String,
    private var wear: Int = 100
) {
    fun heat() {}
    fun protect() {}
    private fun calculateWear(time: Int) {
        if (time > 10) {
            wear = 90

        }
    }
}


