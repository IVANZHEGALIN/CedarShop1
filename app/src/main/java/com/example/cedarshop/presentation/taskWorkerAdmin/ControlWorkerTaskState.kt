package com.example.cedarshop.presentation.taskWorkerAdmin

data class ControlWorkerTaskState(
    val cardTask: List<Card> = listOf(
        Card("Принять товар", " Придет автомобиль т/с Газель гос номера о465вв150"),
        Card("Отгрузка на 01.05.24", " Отгрузить шакаф и произвести доставку по адресу ул.Пушкина 55 тел. 489-455")
    )
)

class Card (
    val titleTask: String = "",
    val task: String = ""
)