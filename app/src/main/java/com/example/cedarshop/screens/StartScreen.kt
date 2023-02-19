package com.example.cedarshop.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.cedarshop.R

//@Preview
@Composable
fun Start(navController: NavHostController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow),
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
            text = "Cedar",
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
        Text(
            text = "Shop",
            style = TextStyle(
                fontSize = 20.sp,
                shadow = Shadow(
                    color = Color.Blue,
                    offset = Offset(2.0f, 5.0f),
                    blurRadius = 5f
                )
            ),
            fontWeight = FontWeight.Bold
        )
    }
}




