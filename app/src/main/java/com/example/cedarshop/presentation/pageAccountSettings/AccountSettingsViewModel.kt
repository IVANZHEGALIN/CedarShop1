package com.example.cedarshop.presentation.pageAccountSettings

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AccountSettingsViewMode : ViewModel() {
    private val mutableAccountSettings = MutableStateFlow(AccountSettingsState())
    val accountState = mutableAccountSettings.asStateFlow()
}