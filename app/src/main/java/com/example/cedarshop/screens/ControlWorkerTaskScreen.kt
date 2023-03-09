package com.example.cedarshop.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Home
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
fun ControlWorkerTaskScreen(navController: NavHostController) {
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
                            text = "Имя рабочего",
                        )
                    }

                },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                content = {
                    Icon(Icons.Filled.Add, contentDescription = "Добавить")
                },
                onClick = { },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
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
        }
    )
    {
        Column {
            StatusTaskItem(title = "", subtitle = "", navController = navController)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PrevControlWorkerTaskScreen() {
    CedarShopTheme {
        ControlWorkerTaskScreen(navController = rememberNavController())
    }
}


@Composable
fun StatusTaskItem(title: String, subtitle: String, navController: NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 24.dp)
            .clickable { navController.navigate(route = NavRoute.AddNewTaskWorker.route) },
        elevation = 6.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(
                modifier = Modifier
                    .padding(vertical = 2.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Наименование задачи",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp, bottom = 10.dp)
                )
                Text(
                    text = "Техническое задание",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)
                )

            }
            Spacer(modifier = Modifier.weight(1f, true))
            IconButton(onClick = { }) {
                Icon(
                    Icons.Filled.Delete,
                    contentDescription = "Удалить"
                )
            }
        }
    }
}