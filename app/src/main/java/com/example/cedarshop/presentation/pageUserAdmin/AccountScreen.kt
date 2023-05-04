package com.example.cedarshop.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.R
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.presentation.pageUserAdmin.UserState
import com.example.cedarshop.presentation.pageUserAdmin.UserViewModel
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun AccountScreen(
    navController: NavHostController,
    viewModel: UserViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
) {
    val stateUser by viewModel.pageUser.collectAsState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Профиль",
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

        content = {
            LazyColumn {
                item(stateUser) {
                    CardID(
                        state = stateUser
                    )
                }
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
@Composable
fun CardID(

    state: UserState,

    ) {

//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(top = 25.dp, start = 150.dp),
//        horizontalAlignment = Alignment.Start,
//        verticalArrangement = Arrangement.Center
//    ) {
    Image(
        contentScale = ContentScale.Fit,
        painter = painterResource(id = R.drawable.anton_manager),
        contentDescription = "Фото сотрудника"
    )
    Text(
        text = state.firstName,
        fontSize = 15.sp,
        fontFamily = FontFamily.Serif
    )
    Text(
        text = state.lastName,
        fontSize = 15.sp,
        fontFamily = FontFamily.Serif,
        modifier = Modifier.padding(top = 5.dp)
    )
    Text(
        text = state.position,
        fontSize = 15.sp,
        fontFamily = FontFamily.Serif,
        modifier = Modifier.padding(top = 5.dp)
    )
    Text(
        text = state.Number.toString(),
        fontSize = 15.sp,
        fontFamily = FontFamily.Serif,
        modifier = Modifier.padding(top = 5.dp)
    )
}















