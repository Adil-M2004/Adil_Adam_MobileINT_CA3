package com.example.securedoorlockapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class AccessEntry(
    val name: String,
    val time: String,
    val status: String
)

@Composable
fun AccessLogScreen(navController: NavController) {

    val logs = listOf(
        AccessEntry("Adam Cassidy", "10:31 AM", "GRANTED"),
        AccessEntry("Adil", "10:21 AM", "GRANTED"),
        AccessEntry("Unknown", "09:58 AM", "DENIED")
    )

    Scaffold(
        topBar = { TopAppBar(title = { Text("Access Logs") }) }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            items(logs) { entry ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Name: ${entry.name}")
                        Text("Time: ${entry.time}")
                        Text("Status: ${entry.status}")
                    }
                }
            }
        }
    }
}
