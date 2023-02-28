package com.example.cedarshop.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.R
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
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                ImageWorker()
                TextCardID()
            }
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = DarkGreen
            )
            {
                IconButton(onClick = { navController.navigate(route = NavRoute.Worker.route) }

                )
                { Icon(Icons.Filled.Home, contentDescription = "Домой") }


                IconButton(onClick = { navController.navigate(route = NavRoute.AccountSettings.route) } // при нажатии на икнку , должно открыться поля для редактирования аккаунта

                )
                { Icon(Icons.Filled.Settings, contentDescription = "Настройки") }


            }
        }
    )

}

@Preview(showBackground = true)
@Composable
fun PrevAccountScreen() {
    CedarShopTheme() {
        AccountScreen(navController = rememberNavController())
    }
}



// CONTENT
@Preview(showBackground = true)
@Composable
fun ImageWorker() {

        Image(
            contentScale = ContentScale.Fit,
            painter = painterResource(id = R.drawable.anton_manager),
            contentDescription = "Фото сотрудника"
        )
    }


@Preview(showBackground = true)
@Composable
fun TextCardID() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 25.dp, start = 150.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Фамилия",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif
        )
        Text(
            text = "Имя",
            fontSize =15.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 5.dp)
        )
        Text(
            text = "Должность",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 5.dp)
        )
        Text(
            text = "Номер",
            fontSize = 15.sp,
            fontFamily = FontFamily.Serif,
            modifier = Modifier.padding(top = 5.dp)
        )
    }
}














