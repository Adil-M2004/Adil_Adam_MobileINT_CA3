package com.example.securedoorlockapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.securedoorlockapp.screens.AccessLogScreen
import com.example.securedoorlockapp.screens.AlertsScreen
import com.example.securedoorlockapp.screens.DashboardScreen

@Composable
fun AppNav(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "dashboard"
    ) {
        composable("dashboard") {
            DashboardScreen(navController)
        }
        composable("logs") {
            AccessLogScreen(navController)
        }
        composable("alerts") {
            AlertsScreen(navController)
        }
    }
}
