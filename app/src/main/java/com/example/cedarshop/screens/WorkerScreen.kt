package com.example.cedarshop.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.ui.theme.CedarShopTheme
import java.nio.file.WatchEvent.Modifier

@Composable
fun WorkerScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            BottomAppBar {

                IconButton(onClick = { }) {
                    Icon(
                        Icons.Filled.AccountBox,
                        contentDescription = "Аккаунт"
                    )
                }
            }
        }
    )
    {

    }
   
}


@Preview(showBackground = true)
@Composable
fun prevWorkerScreen() {
    CedarShopTheme() {
        WorkerScreen(navController = rememberNavController())
    }
}