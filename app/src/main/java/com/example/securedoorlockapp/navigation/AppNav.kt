package com.example.securedoorlockapp.navigation

<<<<<<< HEAD
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.securedoorlockapp.screens.AccessLogScreen
import com.example.securedoorlockapp.screens.AddUserScreen
import com.example.securedoorlockapp.screens.AlertsScreen
import com.example.securedoorlockapp.screens.DashboardScreen

@Composable
fun AppNav(
    navController: NavHostController,
    windowSizeClass: WindowSizeClass
) {

    NavHost(
        navController = navController,
        startDestination = "dashboard",
        enterTransition = { slideInHorizontally(initialOffsetX = { 1000 }, animationSpec = tween(300)) },
        exitTransition = { slideOutHorizontally(targetOffsetX = { -1000 }, animationSpec = tween(300)) },
        popEnterTransition = { slideInHorizontally(initialOffsetX = { -1000 }, animationSpec = tween(300)) },
        popExitTransition = { slideOutHorizontally(targetOffsetX = { 1000 }, animationSpec = tween(300)) }
    ) {
=======
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.NavHostController
import com.example.securedoorlockapp.screens.*

@Composable
fun AppNav(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "dashboard") {
>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd

        composable("dashboard") {
            DashboardScreen(
                onNavigateToAlerts = { navController.navigate("alerts") },
<<<<<<< HEAD
                onNavigateToLogs = { navController.navigate("logs") },
                onNavigateToAddUser = { navController.navigate("addUser") },
                windowSizeClass = windowSizeClass
=======
                onNavigateToLogs = { navController.navigate("logs") }
>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd
            )
        }

        composable("alerts") {
            AlertsScreen(
<<<<<<< HEAD
                onBack = { navController.popBackStack() },
                windowSizeClass = windowSizeClass
=======
                onBack = { navController.popBackStack() }
>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd
            )
        }

        composable("logs") {
            AccessLogScreen(
<<<<<<< HEAD
                onBack = { navController.popBackStack() },
                windowSizeClass = windowSizeClass
            )
        }

        composable("addUser") {
            AddUserScreen(
                onBack = { navController.popBackStack() },
                windowSizeClass = windowSizeClass
            )
        }
    }
}
=======
                onBack = { navController.popBackStack() }
            )
        }
    }
}
>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd
