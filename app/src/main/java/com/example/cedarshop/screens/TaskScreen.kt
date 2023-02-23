package com.example.cedarshop.screens



import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun TaskScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            BottomNavigation(backgroundColor = DarkGreen)
            {
                IconButton(onClick = { navController.navigate(route = NavRoute.Worker.route)}

                )
                { Icon(Icons.Filled.Home,contentDescription = "Home")}


            }
        }
    )
    {

    }
}





@Preview(showBackground = true)
@Composable
fun prevTaskScreen() {
    CedarShopTheme() {
        TaskScreen(navController = rememberNavController())
    }
}








//Scaffold(
//                    topBar = {
//                        TopAppBar(
//                            title = {
//                                Text(text = "Мебельный магазин Кедр")
//                            },
//                            backgroundColor = DarkGreen,
//                            contentColor = Color.White,
//                            elevation = 12.dp
//                        )
//                    },
//                    content = {
//                        Surface(
//                            modifier = Modifier.fillMaxSize(),
//                            color = MaterialTheme.colors.background
//                        )