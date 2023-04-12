package com.example.cedarshop.presentation.pageAuhtorization

data class LoginPassword (
    val login: String = "" ,
    val hasLoginError:Boolean = false,

    val password: String = "",
    val hasPasswordError:Boolean = false
)

