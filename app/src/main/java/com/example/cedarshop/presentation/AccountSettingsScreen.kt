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
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.R
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun AccountSettingsScreen(navController: NavHostController) {
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
fun TextFieldCardID() {
    var textFirstName by remember { mutableStateOf(TextFieldValue("")) }
    var textName by remember { mutableStateOf(TextFieldValue("")) }
    var textPosition by remember { mutableStateOf(TextFieldValue("")) }
    var textNumber by remember { mutableStateOf(TextFieldValue("")) }
    Column {


        OutlinedTextField(
            modifier = Modifier.padding(top = 5.dp),
            value = textFirstName,
            onValueChange = { textFirstName = it },
            label = { Text(text = "Фамилия") }

        )
        OutlinedTextField(
            value = textName,
            label = { Text(text = "Имя") },
            onValueChange = { textName = it }
        )
        OutlinedTextField(
            value = textPosition,
            label = { Text(text = "Должность") },
            onValueChange = { textPosition = it }
        )
        OutlinedTextField(
            value = textNumber,
            label = { Text(text = "Номер") },
            onValueChange = { textNumber = it },
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
