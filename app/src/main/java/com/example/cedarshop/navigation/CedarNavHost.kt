package com.example.cedarshop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.screens.Admin
import com.example.cedarshop.screens.Main
import com.example.cedarshop.screens.StartInfo
import com.example.cedarshop.screens.Worker

sealed class NavRoute(val route: String) {
    object Start : NavRoute("start_sreen")
    object StartInfo : NavRoute("start_info_sreen")
    object Main : NavRoute("main_sreen")
    object Admin : NavRoute("admin_sreen")
    object Worker : NavRoute("worker_sreen")
}


@Composable
fun CedarNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.Start.route) {
        composable(NavRoute.Start.route){ Start(navController = navController)}
        composable(NavRoute.StartInfo.route){ StartInfo(navController = navController)}
        composable(NavRoute.Main.route){ Main(navController = navController)}
        composable(NavRoute.Admin.route){ Admin(navController = navController)}
        composable(NavRoute.Worker.route){ Worker(navController = navController)}
        }
    }
