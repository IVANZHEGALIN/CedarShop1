package com.example.cedarshop.presentation.listWorkersAdmin

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ListWorkerViewModel : ViewModel() {
    private val mutableListWorkerState = MutableStateFlow(ListWorkerState())
          val listWorker = mutableListWorkerState.asStateFlow()
}

