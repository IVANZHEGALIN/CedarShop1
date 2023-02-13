package com.example.cedarshop.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cedarshop.R

@Preview
@Composable
fun MainScreen() {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    )
    {
        Column() {

            Image(
                painter = painterResource(id = R.drawable.cadar_logo),
                contentDescription = "img"
            )
            Text(textAlign= TextAlign.Center,
                text = "Cedar")
            Text(text = "Shop",
                textAlign= TextAlign.Center)
        }
    }
}



