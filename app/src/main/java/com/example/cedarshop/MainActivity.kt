package com.example.cedarshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.cedarshop.navigation.CedarNavHost
import com.example.cedarshop.ui.theme.CedarShopTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CedarShopTheme {
                CedarNavHost()
            }
        }
    }
}


@Preview
@Composable
fun DefaultPreview() {
    CedarShopTheme {

    }
}

