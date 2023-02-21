package com.example.cedarshop.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class Personnel(
    val name: String,
    val age: Int,
    val number: Long,
    val position: String
) {
    fun work() {
    }
}



open class ShopAssisten(
    val id: Personnel,
    val consult: String,
) {
    fun sell() {

    }
}

class Ivan(
    id: Personnel,
    consult: String
) : ShopAssisten
    (
    id = Personnel
        (
        "Ivan",
        25,
        89065537339,
        "manager"
    ),
    "вам подсказать?",

    ) {
    fun sall() {

    }
}

class Manager() {
    init {
        val managerIlya = Personnel(
        "Ilya",
        26,
        89612546584,
        "top manager")
    }
}
 val manager = Manager()


val ivan = Manager()






