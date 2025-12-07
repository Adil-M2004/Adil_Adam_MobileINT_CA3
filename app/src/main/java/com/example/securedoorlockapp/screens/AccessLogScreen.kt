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
fun AccessLogScreen(onBack: () -> Unit) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text("Access Logs", modifier = Modifier.padding(bottom = 20.dp))

            Text("• 12:03 - Adam unlocked the door")
            Text("• 13:15 - Incorrect PIN")
            Text("• 15:40 - System locked after timeout")

            Spacer(modifier = Modifier.height(30.dp))

            Button(onClick = onBack) {
                Text("Back")
            }
        }
    }
}
