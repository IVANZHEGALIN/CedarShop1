package com.example.cedarshop.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
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
                ButtonDownloadPhoto()
                TextFieldFirstName()
                TextFieldName()
                TextFieldPosition()
                TextFieldNumber()
            }
        },
        bottomBar = {
            BottomNavigation(
                backgroundColor = DarkGreen
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
//TOPBAR



// CONTENT
@Preview(showBackground = true)
@Composable
fun ImageWorker() {
    Image(
        painter = painterResource(id = R.drawable.anton_manager),
        contentDescription = "Фото сотрудника"
    )
}

@Preview(showBackground = true)
@Composable
fun ButtonDownloadPhoto() {
    Button(onClick = { /*TODO*/ })
    {
        Text(text = "Загрузить фото")
    }
}


@Preview(showBackground = true)
@Composable
fun TextFieldFirstName() {
    var textFirstName by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(
        modifier = Modifier.padding(top = 25.dp),
        value = textFirstName,
        onValueChange = { textFirstName = it },
        label = { Text(text = "Фамилия") }

    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldName() {
    var textName by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(
        value = textName,
        label = { Text(text = "Имя") },
        onValueChange = { textName = it }
    )
}


@Preview(showBackground = true)
@Composable
fun TextFieldPosition() {
    var textPosition by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(
        value = textPosition,
        label = { Text(text = "Должность") },
        onValueChange = { textPosition = it }
    )
}

@Preview(showBackground = true)
@Composable
fun TextFieldNumber() {
    var textNumber by remember { mutableStateOf(TextFieldValue("")) }

    OutlinedTextField(
        value = textNumber,
        label = { Text(text = "Номер") },
        onValueChange = { textNumber = it },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
    )
}











