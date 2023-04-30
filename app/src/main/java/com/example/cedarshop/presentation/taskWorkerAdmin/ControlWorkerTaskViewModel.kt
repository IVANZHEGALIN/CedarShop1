package com.example.cedarshop.presentation.taskWorkerAdmin

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ControlWorkerTaskViewModel : ViewModel() {
    private val mutableWorkerTask = MutableStateFlow(ControlWorkerTaskState())
    val listWorkerTask = mutableWorkerTask.asStateFlow()
}