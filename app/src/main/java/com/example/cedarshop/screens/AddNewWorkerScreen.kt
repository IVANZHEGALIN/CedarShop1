package com.example.cedarshop.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
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
fun AddNewWorkerScreen(navController: NavHostController) {
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
                            text = "Настроки профиля",
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
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            )
            {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .fillMaxSize()
                        .padding(top =30.dp, bottom = 60.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    PhotoNewWorker()
                    ButtonDownloadPhotoNewWorker()
                    TextFieldCardNewWorker()
                    ButtonSaveSettingNewWorker()
                }
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
fun PrevAddNewWorkerScreen() {
    AddNewWorkerScreen(navController = rememberNavController())
}


@Preview(showBackground = true)
@Composable
fun PhotoNewWorker() {
    Image(
        painter = painterResource(id = R.drawable.anton_manager),
        contentDescription = "Фото сотрудника"
    )
}


@Preview(showBackground = true)
@Composable
fun ButtonDownloadPhotoNewWorker() {
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
fun TextFieldCardNewWorker() {
    var textFirstName by remember { mutableStateOf(TextFieldValue("")) }
    var textName by remember { mutableStateOf(TextFieldValue("")) }
    var textPosition by remember { mutableStateOf(TextFieldValue("")) }
    var textNumber by remember { mutableStateOf(TextFieldValue("")) }
    var textLogin by remember { mutableStateOf(TextFieldValue("")) }
    var textPassword by remember { mutableStateOf(TextFieldValue("")) }
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
        OutlinedTextField(
            value = textLogin,
            label = { Text(text = "Логин") },
            onValueChange = { textLogin = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        OutlinedTextField(
            value = textPassword,
            label = { Text(text = "Пароль") },
            onValueChange = { textPassword = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonSaveSettingNewWorker() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(top = 5.dp)
        )
        {
            Text(text = "Сохранить")
        }
    }
}






