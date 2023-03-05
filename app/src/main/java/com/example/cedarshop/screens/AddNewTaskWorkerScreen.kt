package com.example.cedarshop.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.ui.theme.CedarShopTheme

@Composable
fun AddNewTaskWorkerScreen(navController: NavHostController) {

}




@Preview(showBackground = true)
@Composable
fun prevAddNewTaskWorkerScreen() {
    CedarShopTheme() {
        AddNewTaskWorkerScreen(navController = rememberNavController())
    }
}
