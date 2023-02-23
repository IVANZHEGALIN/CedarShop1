package com.example.cedarshop.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
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

@Composable
fun AccountScreen(navController: NavHostController) {
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
                            text = "Профиль",
                        )
                    }
                },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp
            )
        },
        content = {
            Column() {

            }
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = DarkGreen
                //modifier = Modifier.fillMaxSize()
            )
            {
                IconButton(onClick = { navController.navigate(route = NavRoute.Worker.route) }

                )
                { Icon(Icons.Filled.Home, contentDescription = "Home") }
                IconButton(onClick = { navController.navigate(route = NavRoute.Account.route) } // при нажатии на икнку , должно открыться поля для редактирования аккаунта

                )
                { Icon(Icons.Filled.Settings, contentDescription = "Setting") }


            }
        }
    )

}


@Preview(showBackground = true)
@Composable
fun prevAccountScreen() {
    CedarShopTheme() {
        AccountScreen(navController = rememberNavController())
    }
}