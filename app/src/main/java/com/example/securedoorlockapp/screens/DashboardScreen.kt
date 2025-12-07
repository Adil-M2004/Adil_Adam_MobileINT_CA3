package com.example.securedoorlockapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.LockOpen
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(navController: NavController) {

    var locked by remember { mutableStateOf(true) }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Secure Door Lock") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            Icon(
                imageVector = if (locked) Icons.Filled.Lock else Icons.Filled.LockOpen,
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            Button(onClick = { locked = !locked }) {
                Text(if (locked) "Unlock Door" else "Lock Door")
            }

            Button(
                onClick = { navController.navigate("logs") },
                modifier = Modifier.fillMaxWidth()
            ) { Text("Access Logs") }

            Button(
                onClick = { navController.navigate("alerts") },
                modifier = Modifier.fillMaxWidth()
            ) { Text("Unknown Alerts") }
        }
    }
}
