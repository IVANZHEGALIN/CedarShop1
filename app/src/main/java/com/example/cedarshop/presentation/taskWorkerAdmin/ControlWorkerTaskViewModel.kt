package com.example.cedarshop.presentation.taskWorkerAdmin

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class ControlWorkerTaskViewModel : ViewModel() {
    private val mutableWorkerTask = MutableStateFlow(ControlWorkerTaskState())
}