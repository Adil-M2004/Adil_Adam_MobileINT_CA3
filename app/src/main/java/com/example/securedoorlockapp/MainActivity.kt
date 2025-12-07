package com.example.securedoorlockapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import com.example.securedoorlockapp.navigation.AppNav
import com.example.securedoorlockapp.ui.theme.SecureDoorLockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecureDoorLockTheme {
                Surface {
                    val navController = rememberNavController()
                    AppNav(navController)
                }
            }
        }
    }
}
