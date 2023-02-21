package com.example.cedarshop.navigation

import android.graphics.Color.parseColor
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.R
import com.example.cedarshop.ui.theme.CedarShopTheme
import com.example.cedarshop.ui.theme.LightGreen
import kotlinx.coroutines.delay


@Composable
fun StartScreen(navController: NavHostController) {


    Column(
        modifier = Modifier
            .background(color = LightGreen
                )
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(id = R.drawable.cadar_logo),
            contentDescription = "Logo shop",
            modifier = Modifier
                .clip(CircleShape)
        )
        Text(
        text = "Кедар",
            style = TextStyle(
                fontSize = 30.sp,
                shadow = Shadow(
                    color = Color.Blue,
                    offset = Offset(2.0f, 5.0f),
                    blurRadius = 5f
                )
            ),
            fontWeight = FontWeight.Bold
        )

    }
    LaunchedEffect(key1 = true) {
        delay(500L)
        navController.navigate(route = NavRoute.StartInfo.route)
    }
}



@Preview(showBackground = true)
@Composable
fun prevStartScreen() {
    CedarShopTheme() {
        StartScreen(navController = rememberNavController())
    }
}






