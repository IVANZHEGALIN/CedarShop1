package com.example.cedarshop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cedarshop.screens.*

sealed class NavRoute(val route: String) {
    object StartInfo : NavRoute("start_info_screen")
    object Main : NavRoute("main_screen")
    object Admin : NavRoute("admin_screen")
    object ControlWorkerTask: NavRoute("control_worker_task_screen")
    object AddNewWorker : NavRoute("add_naw_worker_screen")
    object AddNewTaskWorker : NavRoute("add_new_task_worker_screen")
    object Worker : NavRoute("worker_screen")
    object Account : NavRoute("account_screen")
    object AccountSettings : NavRoute("account_settings_sceen")
    object Task : NavRoute("task_screen")
}


@Composable
fun CedarNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.StartInfo.route) {
        composable(NavRoute.StartInfo.route) { StartInfoScreen(navController = navController) }
        composable(NavRoute.Main.route) { MainScreen(navController = navController) }
        composable(NavRoute.Admin.route) { AdminScreen(navController = navController) }
        composable(NavRoute.ControlWorkerTask.route) { ControlWorkerTaskScreen(navController = navController) }
        composable(NavRoute.AddNewWorker.route) { AddNewWorkerScreen(navController = navController) }
        composable(NavRoute.AddNewTaskWorker.route) { AddNewTaskWorkerScreen(navController = navController) }
        composable(NavRoute.Worker.route) { WorkerScreen(navController = navController) }
        composable(NavRoute.Account.route) { AccountScreen(navController = navController) }
        composable(NavRoute.AccountSettings.route) { AccountSettingsScreen(navController = navController) }
        composable(NavRoute.Task.route) { TaskScreen(navController = navController) }
    }
}





