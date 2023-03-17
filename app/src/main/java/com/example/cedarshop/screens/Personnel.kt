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
// if (loginPasswordState.hasLoginError) {
//    val T = 0
//}


/*  if (textLogin.text.isEmpty()) {
                            Toast.makeText(
                                this,
                                "Введите логин",
                                1
                            ).show()
                        } else if (textPassword.text.isEmpty()) {
                            Toast.makeText(
                                this,
                                "Введите  пароль",
                                1
                            ).show()
                        }*/

