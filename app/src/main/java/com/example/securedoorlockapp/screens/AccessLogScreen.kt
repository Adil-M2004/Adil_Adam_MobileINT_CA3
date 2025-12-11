package com.example.securedoorlockapp.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// A data class to hold the information for each log entry
data class LogEntry(val message: String, val fullTimestamp: String)

@Composable
fun AccessLogScreen(
    onBack: () -> Unit,
    windowSizeClass: WindowSizeClass
) {

    // Sample log data
    val logs = listOf(
        LogEntry("Adam unlocked door at 09:10 AM", "2024-05-24 09:10:32.123"),
        LogEntry("Adil locked door at 09:12 AM", "2024-05-24 09:12:15.456"),
        LogEntry("Unknown user attempted access at 09:14 AM", "2024-05-24 09:14:03.789")
    )

    // A list of booleans to keep track of the expanded state for each log item
    val expandedStates = remember { mutableStateListOf<Boolean>().apply { addAll(List(logs.size) { false }) } }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
        ) {
            Text(
                text = "Access Logs",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 20.dp)
            )

            // Loop through the logs and display them
            logs.forEachIndexed { index, entry ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable { expandedStates[index] = !expandedStates[index] } // Toggle the state on click
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = entry.message,
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(16.dp),
                                fontSize = 16.sp
                            )
                            // Show ExpandMore or ExpandLess icon based on the state
                            val icon = if (expandedStates[index]) Icons.Default.ExpandLess else Icons.Default.ExpandMore
                            Icon(
                                imageVector = icon,
                                contentDescription = "Expand log entry",
                                modifier = Modifier.padding(16.dp)
                            )
                        }

                        // Show the timestamp with an animation when expanded
                        AnimatedVisibility(
                            visible = expandedStates[index],
                            enter = slideInVertically() + fadeIn(),
                            exit = slideOutVertically() + fadeOut()
                        ) {
                            Text(
                                text = "Timestamp: ${entry.fullTimestamp}",
                                modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
                                style = MaterialTheme.typography.bodySmall
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = onBack,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text("Back")
            }
        }
    }
}
