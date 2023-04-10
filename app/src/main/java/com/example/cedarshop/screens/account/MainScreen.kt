package com.example.cedarshop.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.screens.account.AccountViewModel
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen


@Composable
fun MainScreen(
    navController: NavHostController,
    viewModel: AccountViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
) {
    val loginPasswordState by viewModel.loginPasswordState.collectAsState()




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
                            text = "Вход в аккаунт",
                        )
                    }
                },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {

            var textLogin by remember { mutableStateOf(TextFieldValue("")) }
            var isErrorLogin = loginPasswordState.hasLoginError
            OutlinedTextField(
                value = textLogin,
                label = { Text(text = "Логин") },
                onValueChange = { value ->
                    textLogin = value
                    viewModel.onTextLogin(value.text)
                    isErrorLogin = false

                },
                isError = isErrorLogin
            )
            if (isErrorLogin){
                Text(text = "Неверный логин",
                    color = Color.Red,
                    style = TextStyle.Default,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }


            var textPassword by remember { mutableStateOf(TextFieldValue("")) }
            var isErrorPassword = loginPasswordState.hasPasswordError
            OutlinedTextField(
                value = textPassword,
                label = { Text(text = "Пароль") },
                visualTransformation = PasswordVisualTransformation(),
                onValueChange = { value ->
                    textPassword = value
                    viewModel.onTextPassword(value.text)
                    isErrorPassword = false
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                isError = isErrorPassword

            )
            if (isErrorPassword){
                Text(text = "Неверный пароль",
                    color = Color.Red,
                    style = TextStyle.Default,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }



            Button(
                onClick = {
                    val isLogin = viewModel.Click()
                    if (isLogin) navController.navigate(route = NavRoute.Admin.route) },
                modifier = Modifier
                    .width(100.dp)
                    .padding(bottom = 25.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = DarkGreen,
                    contentColor = Color.White
                )

            )
            {
                Text(text = "Войти")

            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun prevMainScreen() {
    CedarShopTheme() {
        MainScreen(navController = rememberNavController(), AccountViewModel())
    }
}