package com.example.cedarshop.presentation.listWorkers

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cedarshop.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ListWorkerViewModel : ViewModel() {
    private val mutableListWorkerState = MutableStateFlow(ListWorkerState())
    val listWorker = mutableListWorkerState.asStateFlow()
}

