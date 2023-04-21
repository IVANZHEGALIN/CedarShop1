package com.example.cedarshop.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
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
import com.example.cedarshop.presentation.taskWorkerAdmin.Card
import com.example.cedarshop.presentation.taskWorkerAdmin.ControlWorkerTaskState
import com.example.cedarshop.presentation.taskWorkerAdmin.ControlWorkerTaskViewModel
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun ControlWorkerTaskScreen(
    navController: NavHostController,
    viewModel: ControlWorkerTaskViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    val taskState = ControlWorkerTaskState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
//                    Row(
//                        Modifier
//                            .fillMaxSize()
//                            .padding(top = 15.dp),
//                        horizontalArrangement = Arrangement.Center
//                    )
                    Text(
                        text = "Имя рабочего", // имя рабочего нужно как то взять с карточки рабочего ListWorker (AdminScreen)
                    )

                },
                navigationIcon = {
                    IconButton(onClick =
                    { navController.navigate(route = NavRoute.Admin.route) })
                    {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
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
                onClick = { navController.navigate(route = NavRoute.AddNewTaskWorker.route) },
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
        LazyColumn {
            items(taskState.cardTask) { task ->
                StatusTaskItem(
                    taskList = task,
                    navController = navController
                )
            }
        }
//        Column {
//            StatusTaskItem(titleTask =  "", task = "", navController = navController)
//        }
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
fun StatusTaskItem(taskList: Card, navController: NavHostController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 24.dp)
            .clickable { navController.navigate(route = NavRoute.Task.route) },
        elevation = 6.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(
                modifier = Modifier
                    .padding(vertical = 2.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = taskList.titleTask,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 5.dp, top = 5.dp, bottom = 10.dp)
                )
                Text(
                    text = taskList.task,
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