package com.example.securedoorlockapp.screens

import android.util.Log
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
fun AccessLogScreen(navController: NavController) {

    var logs by remember { mutableStateOf<List<AccessLog>>(emptyList()) }

    LaunchedEffect(Unit) {
        try {
            logs = RetrofitClient.api.getLogs()
            Log.d("RETROFIT", "Loaded ${logs.size} logs")
        } catch (e: Exception) {
            Log.e("RETROFIT", "Error: ", e)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Access Logs") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Text("< Back")
                    }
                }
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(12.dp)
        ) {

            items(logs) { log ->

                Card(modifier = Modifier.padding(8.dp)) {
                    Column(modifier = Modifier.padding(12.dp)) {

                        Image(
                            painter = rememberAsyncImagePainter(log.imageUrl),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(160.dp)
                        )

                        Text("Name: ${log.name}")
                        Text("Status: ${log.status}")
                        Text("Time: ${log.timestamp}")
                    }
                }
            }
        }
    }
}
