package com.example.cedarshop.presentation.listWorkersAdmin

import com.example.cedarshop.R


data class ListWorkerState(

    val piopleWorker: MutableList<Worker> = mutableListOf<Worker>(
        Worker("Иван", "Иванов", "разработчик", R.drawable.anton_manager),
        Worker("Петя", "Иванов", "Продавец", R.drawable.petya_seller),
        Worker("Саша", "Пупкина", "рабочий ", R.drawable.saha_zalupa_konskay),
        Worker("Миша", "Прошкин", "Топ менеджер", R.drawable.misha_manager),
    )

) {
    class Worker(
        val firstName: String = "",
        val lastName: String = "",
        val position: String = "",
        val photoID: Int
    )
}



