package com.example.securedoorlockapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.securedoorlockapp.network.AccessLog
import com.example.securedoorlockapp.network.RetrofitClient

@Composable
fun AlertsScreen(navController: NavController) {

    var logs by remember { mutableStateOf<List<AccessLog>>(emptyList()) }

    LaunchedEffect(Unit) {
        logs = RetrofitClient.api.getLogs()
    }

    val unknowns = logs.filter { it.status == "unknown" }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Unknown Alerts") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Text("< Back")
                    }
                }
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier.padding(padding).padding(12.dp)
        ) {

            items(unknowns) { log ->

                Card(modifier = Modifier.padding(8.dp)) {
                    Column(modifier = Modifier.padding(12.dp)) {

                        Image(
                            painter = rememberAsyncImagePainter(log.imageUrl),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(160.dp)
                        )

                        Text("⚠ Unknown Person Attempt")
                        Text("Time: ${log.timestamp}")

                        Button(
                            onClick = { /* Mark reviewed */ },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text("Mark Reviewed")
                        }
                    }
                }
            }
        }
    }
}
