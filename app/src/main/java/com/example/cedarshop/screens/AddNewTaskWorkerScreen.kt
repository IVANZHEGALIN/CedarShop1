package com.example.cedarshop.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen
import com.example.cedarshop.ui.theme.LightGreen

@Composable
fun AddNewTaskWorkerScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Новая задача",
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(route = NavRoute.ControlWorkerTask.route) }) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                    }

                },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp
            )
        },
        bottomBar = {
            BottomAppBar(backgroundColor = DarkGreen) {
                IconButton(onClick = { navController.navigate(route = NavRoute.Admin.route) }) {
                    Icon(
                        Icons.Filled.Home,
                        contentDescription = "Главная страница"
                    )
                }
            }
        },
        content = {
            StatusTaskItem()
        }
    )


}


@Preview(showBackground = true)
@Composable
fun PrevAddNewTaskWorkerScreen() {
    CedarShopTheme() {
        AddNewTaskWorkerScreen(navController = rememberNavController())
    }
}


@Composable
fun StatusTaskItem() {
    Column() {


        Box(
            modifier = Modifier
                .background(color = LightGreen)
                .fillMaxWidth()
                .weight(2f)
        ){

        }

        Box(
            modifier = Modifier
                .background(color = Color.Red)
                .fillMaxWidth()
                .weight(2f)
        ){

        }

    }
}









