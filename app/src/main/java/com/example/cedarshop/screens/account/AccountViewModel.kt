package com.example.cedarshop.screens.account

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AccountViewModel : ViewModel() {
    private val mutableLoginListState  = MutableStateFlow(LoginPassword())
    val loginPasswordState = mutableLoginListState.asStateFlow()
}

fun onTextLog(Textlogin: String) {
    mutableLoginListState.update { state ->
        state.copy(login = houseText)
    }

