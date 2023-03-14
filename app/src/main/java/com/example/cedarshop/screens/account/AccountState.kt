package com.example.cedarshop.screens.account

data class LoginPassword (
    val login: String = "" ,
    val hasLoginError:Boolean = false,

    val password: String = "",
    val hasPasswordError:Boolean = false
)

