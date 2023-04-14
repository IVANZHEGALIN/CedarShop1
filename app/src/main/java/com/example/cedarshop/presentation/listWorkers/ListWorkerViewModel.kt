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

















//    val workerList: MutableLiveData<List<ListWorkerState>> by lazy {
//        MutableLiveData<List<ListWorkerState>>()
//    }

//    init {
//        listOf<ListWorkerState>(
//            ListWorkerState(firstName = "Ivan", lastName = "Zhegalin",position ="devoloper", photoID = R.drawable.anton_manager),
//            ListWorkerState(firstName = "paha", lastName = "pupkin",position ="Manager", photoID = R.drawable.anton_manager),
//            ListWorkerState(firstName = "Slava", lastName = "lozhkin",position ="worker", photoID = R.drawable.anton_manager),
//            ListWorkerState(firstName = "Tanya", lastName = "popova",position ="Topmanager", photoID = R.drawable.anton_manager),
//        )
//    }





// происходит соохранение в State
//    fun firstNameState(firstName: String) {
//        mutableListWorkerState.update { state ->
//            state.copy(firstName = firstName)
//        }
//    }
//
//    fun lastNameState(lastName: String) {
//        mutableListWorkerState.update { state ->
//            state.copy(lastName = lastName)
//        }
//    }
//
//    fun positionState(position: String) {
//        mutableListWorkerState.update { state ->
//            state.copy(position = position)
//        }
//    }
//
//    fun photoIDState(photoID: Int) {
//        mutableListWorkerState.update { state ->
//            state.copy(photoID = photoID)
//        }
//    }