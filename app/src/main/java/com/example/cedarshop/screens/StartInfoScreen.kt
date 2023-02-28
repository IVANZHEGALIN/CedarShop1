package com.example.cedarshop.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.navigation.NavRoute
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.DarkGreen


@Composable
fun StartInfoScreen(navController: NavHostController) {
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
                            text = "Мебельный магазин Кедр",
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
                    .fillMaxSize()
                    .padding(start = 8.dp, top = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center

            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 60.dp),
                    text = "История фирмы «Кедр»",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold

                )

                Text(
                    text = "История фирмы уходит своими корнями в те далекие времена, когда еще не существовали калькуляторы, компьютеры, а в обиходе у бухгалтера были счеты и пишущая машинка, на которой печатались платежные поручения для банка, и вся бухгалтерия умещалась в одной толстой тетради, написанной от руки.\n" +
                            "\n" +
                            "Подвальное помещение, самодельное оборудование, первая грузовая машина ГАЗ-52 фургон и несколько энтузиастов, решивших в эпоху тотального дефицита, снабдить жителей города Кимры кухонными гарнитурами из фанеры и дерева. В одном единственном мебельном магазине за ними была очередь. Жаждущие приобрести заветный простой набор шкафов длинной 2 метра, днями и ночами, в любое время года, с номерками на ладонях, караулили поступления этой самой мебели.",
                    textAlign = TextAlign.Center
                )
                Button(
                    onClick =
                    { navController.navigate(route = NavRoute.Main.route) },
                    modifier =
                    Modifier
                        .width(100.dp)
                        .padding(bottom = 25.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = DarkGreen,
                        contentColor = Color.White
                    )
                ) {
                    Text(text = "Далее")
                }
            }


        }
    )
}


@Preview(showBackground = true)
@Composable
fun PrevStartInfoScreen() {
    CedarShopTheme() {
        StartInfoScreen(navController = rememberNavController())
    }
}