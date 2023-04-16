package com.example.cedarshop.presentation.listWorkers



data class ListWorkerState(

    val piopleWorker: List<Worker> = listOf(
        Worker("Иван","Жегалин","разработчик"),
        Worker("Петя","Иванов","Продавец"),
        Worker("Саша","Пупкина","залупа конская"),
        Worker("Миша","Прошкин","Топ менеджер"),
    )
)
 class Worker(
    val firstName: String = "",
    val lastName: String = "",
    val position: String = "",
    //val photoID: Int? = null
)

//        ListWorkerState(
//            firstName = "Ivan",
//            lastName = "Zhegalin",
//            position = "devoloper",
//            photoID = R.drawable.anton_manager
//        )

