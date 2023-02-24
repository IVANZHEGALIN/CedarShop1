package com.example.cedarshop.screens


import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun TaskScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            BottomNavigation(backgroundColor = DarkGreen)
            {
                IconButton(onClick = { navController.navigate(route = NavRoute.Worker.route) }

                )
                { Icon(Icons.Filled.ArrowBack, contentDescription = "Home") }
            }
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
                            text = "Задачи",
                        )
                    }
                },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp
            )
        },

        content = {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {

            }
        },
        bottomBar = {
            BottomNavigation(backgroundColor = DarkGreen)
            {
                IconButton(onClick = { navController.navigate(route = NavRoute.Worker.route) }

                )
                { Icon(Icons.Filled.Home, contentDescription = "Home") }
            }
        }
    )
}


@Preview(showBackground = true)
@Composable
fun prevTaskScreen() {
    CedarShopTheme() {
        TaskScreen(navController = rememberNavController())
    }
}


@Preview(showBackground = true)
@Composable
fun Image() {
    IconButton(onClick = { /*TODO*/ })

    { Icon(Icons.Filled.Build, contentDescription = "Home") }
}








