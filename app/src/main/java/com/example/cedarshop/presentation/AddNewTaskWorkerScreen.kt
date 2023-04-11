package com.example.cedarshop.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

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
                    IconButton(onClick =
                    { navController.navigate(route = NavRoute.ControlWorkerTask.route) })
                    {
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
    var textTitle by remember { mutableStateOf(" ") }
    var textTopic by remember { mutableStateOf(" ") }
    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {


        OutlinedTextField(
            value = textTitle,
            onValueChange = { textTitle = it },
            label = {
                Text(
                    text = "Тема Задания",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif
                )
            },
        )
        Spacer(modifier = Modifier.width(30.dp))
        OutlinedTextField(
            value = textTopic,
            onValueChange = { textTopic = it },
            label = {
                Text(
                    text = "Задание",
                    fontSize = 20.sp,
                    fontFamily = FontFamily.SansSerif
                )
            },
        )
        
    }
}








