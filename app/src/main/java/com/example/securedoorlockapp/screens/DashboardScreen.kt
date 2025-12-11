package com.example.securedoorlockapp.screens

<<<<<<< HEAD
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(
    onNavigateToAlerts: () -> Unit,
    onNavigateToLogs: () -> Unit,
    onNavigateToAddUser: () -> Unit,
    windowSizeClass: WindowSizeClass
) {
    val isExpandedScreen = windowSizeClass.widthSizeClass == WindowWidthSizeClass.Expanded

    Surface(modifier = Modifier.fillMaxSize()) {
        if (isExpandedScreen) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxSize().padding(16.dp)
            ) {
                Text(text = "Dashboard")
                Button(
                    onClick = onNavigateToAlerts,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "View Alerts")
                }
                Button(
                    onClick = onNavigateToLogs,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "View Access Logs")
                }
                Button(
                    onClick = onNavigateToAddUser,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "Add User")
                }
            }
        } else {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize().padding(16.dp)
            ) {
                Text(text = "Dashboard")
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = onNavigateToAlerts,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "View Alerts")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = onNavigateToLogs,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "View Access Logs")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = onNavigateToAddUser,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
                ) {
                    Text(text = "Add User")
                }
            }
        }
    }
}
=======
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(onNavigateToAlerts: () -> Unit, onNavigateToLogs: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Dashboard", modifier = Modifier.padding(bottom = 20.dp))

            Button(onClick = onNavigateToAlerts, modifier = Modifier.fillMaxWidth()) {
                Text("View Alerts")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = onNavigateToLogs, modifier = Modifier.fillMaxWidth()) {
                Text("View Access Logs")
            }
        }
    }
}
>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd
