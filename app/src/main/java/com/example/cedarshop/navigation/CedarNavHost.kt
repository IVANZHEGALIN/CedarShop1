package com.example.cedarshop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

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
        composable(NavRoute.Start.route){ }
    }
}