package com.example.cedarshop.presentation


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.presentation.listWorkers.ListWorkerState
import com.example.cedarshop.presentation.listWorkers.ListWorkerViewModel
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun AdminScreen(navController: NavHostController,
viewModel: ListWorkerViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    val listWorkerState by viewModel.listWorker.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        Modifier
                            .fillMaxSize()
                            .padding(top = 10.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            "Список работников",
                            fontSize = 24.sp

                        )
                        Spacer(Modifier.weight(1f, true))
                        IconButton(onClick = { }) {
                            Icon(
                                Icons.Filled.Search,
                                modifier = Modifier.size(30.dp),
                                contentDescription = "Поиск"
                            )
                        }
                    }
                },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp,
            )
        },

        floatingActionButton = {
            FloatingActionButton(
                content = {
                    Icon(Icons.Filled.Add, contentDescription = "Добавить")
                },
                onClick = { navController.navigate(route = NavRoute.AddNewWorker.route) },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
            )
        },
        bottomBar = {
            BottomAppBar(backgroundColor = DarkGreen) {

            }

            IconButton(onClick = { navController.navigate(route = NavRoute.Admin.route) }) {
                Icon(
                    Icons.Filled.AccountBox,
                    contentDescription = "Аккаунт"
                )
            }

        }
    )
    {
//        Column() {
//            WorkerItem(FirstName = "Ivan", LastName = "Petrov", Position = "top manager", navController = navController)
//            WorkerItem(FirstName = "Iliy", LastName = "Popov", Position = "worker", navController = navController)
//            WorkerItem(FirstName = "", LastName = "", Position = "", navController = navController)
//        }
        LazyColumn{ items (ListWorkerState){ListWorkerState -> WorkerItem(
            list =ListWorkerState() ,
            navController = NavHostController()
        )} }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PrevAdminScreen() {
    CedarShopTheme() {
        AdminScreen(navController = rememberNavController())
    }
}


@Composable
fun WorkerItem(list: ListWorkerState, navController: NavHostController) {
    Card(
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 24.dp)
            .clickable { navController.navigate(route = NavRoute.ControlWorkerTask.route) },
        elevation = 6.dp
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = com.example.cedarshop.R.drawable.anton_manager),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(70.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))
            Column() {
                Text(
                    text = list.firstName,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = list.lastName,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = list.position,
                    fontSize = 16.sp
                )

            }
            Spacer(modifier = Modifier.weight(1f, true))
            IconButton(onClick = { navController.navigate(route = NavRoute.AddNewWorker.route) }) {
                Icon(
                    Icons.Filled.Settings,
                    contentDescription = "Аккаунт"
                )
            }
        }
    }
}

