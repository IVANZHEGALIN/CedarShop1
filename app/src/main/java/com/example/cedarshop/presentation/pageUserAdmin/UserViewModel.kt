package com.example.cedarshop.presentation.pageUserAdmin

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class UserViewModel: ViewModel(){
    private val mutableUser = MutableStateFlow(UserState())
}
