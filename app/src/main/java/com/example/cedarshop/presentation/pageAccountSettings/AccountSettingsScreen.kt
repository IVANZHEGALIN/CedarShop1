package com.example.cedarshop.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.R
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.presentation.pageAccountSettings.AccountSettingsState
import com.example.cedarshop.presentation.pageAccountSettings.AccountSettingsViewMode
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun AccountSettingsScreen(
    navController: NavHostController,

) {


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Настроки профиля",
                    )

                },
                navigationIcon = {
                    IconButton(onClick =
                    { navController.navigate(route = NavRoute.Account.route) })
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
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Photo()
                ButtonDownloadPhoto()
                TextFieldCardID()
                ButtonSaveSetting()
            }
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = DarkGreen
            )
            {
                IconButton(onClick = { navController.navigate(route = NavRoute.Admin.route) }

                )
                { Icon(Icons.Filled.Home, contentDescription = "Home") }

            }
        }
    )

}


@Preview(showBackground = true)
@Composable
fun PrevAccountSettingsScreen() {
    AccountSettingsScreen(navController = rememberNavController())
}


@Preview(showBackground = true)
@Composable
fun Photo() {
    Image(
        painter = painterResource(id = R.drawable.anton_manager),
        contentDescription = "Фото сотрудника"
    )
}


@Preview(showBackground = true)
@Composable
fun ButtonDownloadPhoto() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.padding(top = 5.dp)
    )
    {
        Text(text = "Загрузить фото")
    }
}


@Preview(showBackground = true)
@Composable
fun TextFieldCardID(
    viewMode: AccountSettingsViewMode = viewModel()

) {
    val accountState by viewMode.accountState.collectAsState()
//    var textFirstName by remember { mutableStateOf(TextFieldValue(state.firstName)) }
//    var textName by remember { mutableStateOf(TextFieldValue(state.lastName)) }
//    var textPosition by remember { mutableStateOf(TextFieldValue(state.position)) }
//    var textNumber by remember { mutableStateOf(TextFieldValue(state.number)) }
    Column {


        OutlinedTextField(
            modifier = Modifier.padding(top = 5.dp),
            value = accountState.firstName,
            onValueChange = { accountState.firstName },
            label = { Text(text = "Фамилия") }

        )
        OutlinedTextField(
            value = accountState.lastName,
            label = { Text(text = "Имя") },
            onValueChange = { accountState.lastName }
        )
        OutlinedTextField(
            value = accountState.position,
            label = { Text(text = "Должность") },
            onValueChange = { accountState.position }
        )
        OutlinedTextField(
            value = accountState.number,
            label = { Text(text = "Номер") },
            onValueChange = { accountState.number },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonSaveSetting() {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.padding(top = 5.dp)
    )

    {
        Text(text = "Сохранить")
    }
}
