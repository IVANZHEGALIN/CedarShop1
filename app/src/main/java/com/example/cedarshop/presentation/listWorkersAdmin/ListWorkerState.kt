package com.example.cedarshop.presentation.listWorkersAdmin

import com.example.cedarshop.R


data class ListWorkerState(

    val piopleWorker: List<Worker> = listOf(
        Worker("Иван","Жегалин","разработчик", R.drawable.anton_manager),
        Worker("Петя","Иванов","Продавец",R.drawable.petya_seller),
        Worker("Саша","Пупкина","залупа конская",R.drawable.saha_zalupa_konskay),
        Worker("Миша","Прошкин","Топ менеджер",R.drawable.misha_manager),
    )
)
 class Worker(
     val firstName: String = "",
     val lastName: String = "",
     val position: String = "",
     val photoID: Int
)

//        ListWorkerState(
//            firstName = "Ivan",
//            lastName = "Zhegalin",
//            position = "devoloper",
//            photoID = R.drawable.anton_manager
//        )

