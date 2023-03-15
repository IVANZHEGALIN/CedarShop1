package com.example.cedarshop.screens.account

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AccountViewModel : ViewModel() {
    private val mutableLoginListState = MutableStateFlow(LoginPassword())
    val loginPasswordState = mutableLoginListState.asStateFlow()

    // сохраняем данные state
    fun onTextLogin(Textlogin: String) {
        mutableLoginListState.update { state ->
            state.copy(login = Textlogin)
        }

    }
    fun onTextPassword(TextPassword: String) {
        mutableLoginListState.update { state ->
            state.copy(password = TextPassword)
        }

    }

    fun Click() {
        if (login != mutableLoginListState.value.login ) {
            mutableLoginListState.update { state-> state.copy(hasLoginError = true) }
            return
        }
        if (password != mutableLoginListState.value.password) {
            mutableLoginListState.update { state-> state.copy(hasPasswordError = true)}
            return
        }
        val T = 0
    }


    val login = "123"
    val password = "456"
}