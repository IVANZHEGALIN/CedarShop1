package com.example.cedarshop.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun WorkerScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        Modifier
                            .fillMaxSize()
                            .padding(top = 15.dp),
                        horizontalArrangement = Arrangement.Center
                    )

                    {
                        Text(
                            text = "Текущие задачи",
                        )
                    }
                },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp
            )
        },
        bottomBar = {
            BottomAppBar(backgroundColor = DarkGreen) {
                IconButton(onClick = { navController.navigate(route = NavRoute.Account.route) }) {
                    Icon(
                        Icons.Filled.AccountBox,
                        contentDescription = "Аккаунт"
                    )
                }
            }
        }
    )
    {
        Column() {
            TaskItem(title = "", subtitle = "", navController = navController)
        }
    }
}




@Composable
fun TaskItem(title: String, subtitle: String, navController: NavHostController){
    Card(
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 24.dp)
            .clickable { navController.navigate(route = NavRoute.Task.route) },
        elevation = 6.dp
    ) {
        Column(modifier = Modifier
            .padding(vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Наименование задачи",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = "Техническое задание")

        }
    }
}


@Preview(showBackground = true)
@Composable
fun prevWorkerScreen() {
    CedarShopTheme() {
        WorkerScreen(navController = rememberNavController())
    }
}