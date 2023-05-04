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


 class User(
    val name: String,
    val city: String
) {
    fun writecode() {}

}


class Ivan(
    val age: Int,
    info: User)
{
    fun cod (){}
}



















