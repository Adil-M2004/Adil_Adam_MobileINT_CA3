package com.example.securedoorlockapp.screens

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
