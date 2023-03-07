package com.example.cedarshop.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.ui.theme.CedarShopTheme

@Composable
fun AdminTaskStatusScreen(navController: NavHostController) {

}




@Preview(showBackground = true)
@Composable
fun prevAdminTaskStatusScreen() {
    CedarShopTheme() {
        AdminTaskStatusScreen(navController = rememberNavController())
    }
}