package com.example.securedoorlockapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.example.securedoorlockapp.screens.*

@Composable
fun AppNav(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "dashboard") {

        composable("dashboard") {
            DashboardScreen(
                onNavigateToAlerts = { navController.navigate("alerts") },
                onNavigateToLogs = { navController.navigate("logs") }
            )
        }

        composable("alerts") {
            AlertsScreen(
                onBack = { navController.popBackStack() }
            )
        }

        composable("logs") {
            AccessLogScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}
