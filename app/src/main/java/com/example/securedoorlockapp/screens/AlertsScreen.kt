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
fun AlertsScreen(onBack: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Alerts", modifier = Modifier.padding(bottom = 20.dp))

            Text("• Door forced open attempt detected")
            Text("• Wrong PIN entered 3 times")
            Text("• System rebooted")

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = onBack) {
                Text("Back")
            }
        }
    }
}
