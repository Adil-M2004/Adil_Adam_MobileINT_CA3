package com.example.securedoorlockapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AlertsScreen(navController: NavController) {

    var alerts by remember {
        mutableStateOf(
            listOf(
                "Unknown Face Detected – 09:58 AM",
                "Unknown Face Detected – Yesterday"
            )
        )
    }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Alerts") }) }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {

            items(alerts) { alert ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(alert)
                        Button(onClick = {
                            alerts = alerts - alert
                        }) {
                            Text("Review")
                        }
                    }
                }
            }
        }
    }
}

