package com.example.cedarshop.presentation.listWorkers

import com.example.cedarshop.R

data class ListWorkerState(
    val piopleWorker: List<Worker> = listOf(
        Worker("ifgdfs","dfgsdgsf","dfgsdfgs", R.drawable.anton_manager),
        Worker("dfggdfs","dfgsfgdfgdf","dfgdf"),
        Worker("erretert","retrt","ertte"),
        Worker("erretert","retrt","ertte"),

    )
)
 class Worker(
    val firstName: String = "",
    val lastName: String = "",
    val position: String = "",
    val photoID: Int? = null
)


//    val firstName: String = "",
//    val lastName: String = "",
//    val position: String = "",
//    val photoID: Int? = null,
//    val workerlist = listOf(
//        ListWorkerState(
//            firstName = "Ivan",
//            lastName = "Zhegalin",
//            position = "devoloper",
//            photoID = R.drawable.anton_manager
//        ),
//        ListWorkerState(
//            firstName = "paha",
//            lastName = "pupkin",
//            position = "Manager",
//            photoID = R.drawable.anton_manager
//        ),
//        ListWorkerState(
//            firstName = "Slava",
//            lastName = "lozhkin",
//            position = "worker",
//            photoID = R.drawable.anton_manager
//        ),
//        ListWorkerState(
//            firstName = "Tanya",
//            lastName = "popova",
//            position = "Topmanager",
//            photoID = R.drawable.anton_manager
//        ),
//    )
//)


//workerList . add (Worker(
//"Pavel", "Pupkin", "Manager", R.drawable.anton_manager
//))
//workerList . add (Worker(
//"Slava", "Lozhkin", "Manager", R.drawable.anton_manager
//))
//workerList . add (Worker(
//"Olga", "Pupkina", "Top manager", R.drawable.anton_manager
//))
