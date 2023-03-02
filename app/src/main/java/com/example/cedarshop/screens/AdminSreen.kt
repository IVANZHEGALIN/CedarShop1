package com.example.cedarshop.screens



import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen

@Composable
fun AdminScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                modifier = Modifier
                    .fillMaxWidth()
                ,title = {
                Text(
                    "Список работников",
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center,

                )
            },
                backgroundColor = DarkGreen,
                contentColor = Color.White,
                elevation = 12.dp,
            )
        },

        floatingActionButton = {
            FloatingActionButton(
                content = {
                    Icon(Icons.Filled.Clear, contentDescription = "Удалить")
                },
                onClick = { }
            )
        },
        bottomBar = {
            BottomAppBar {
                IconButton(onClick = { }) { Icon(Icons.Filled.Menu, contentDescription = "Меню") }
                Spacer(Modifier.weight(1f, true))
                IconButton(onClick = { }) {
                    Icon(
                        Icons.Filled.Search,
                        contentDescription = "Поиск"
                    )
                }
            }


        }

    )
    {
        Text(text = "Что тот про задание", fontSize = 28.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun PrevAdminScreen() {
    CedarShopTheme() {
        AdminScreen(navController = rememberNavController())
    }
}



/*modifier = Modifier
.fillMaxWidth(),

contentPadding = PaddingValues(horizontal = 90.dp) */