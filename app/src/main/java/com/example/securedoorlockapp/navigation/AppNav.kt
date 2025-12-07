package com.example.securedoorlockapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.securedoorlockapp.screens.*

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "dashboard"
    ) {
        composable("dashboard") { DashboardScreen(navController) }
        composable("logs") { AccessLogScreen(navController) }
        composable("alerts") { AlertsScreen(navController) }
    }
}
