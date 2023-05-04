package com.example.cedarshop.presentation.pageUserAdmin

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class UserViewModel: ViewModel(){
    private val mutableUser = MutableStateFlow(UserState())
    val pageUser = mutableUser.asStateFlow()


}

