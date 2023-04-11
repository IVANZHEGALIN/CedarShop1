package com.example.cedarshop.presentation


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun TaskScreen(navController: NavHostController) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Задачи",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                    )
                },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp
            )
        },


        content = {
            Column()
            {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(5f),
                    contentAlignment = Alignment.Center
                )
                {
                    Text(
                        text = "Написанное ТЗ",
                        fontSize = 22.sp
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(2f),
                    contentAlignment = Alignment.Center
                )
                {
                    ButtonDelay()  // при нажатии кнопки отложить, меняется цвет на основном экране в карте задачи
                }
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
fun ButtonDelay() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.padding(top = 5.dp)
    )
    {
        Text(text = "Отложить задачу")
    }
}








