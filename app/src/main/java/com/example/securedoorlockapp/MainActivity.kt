package com.example.securedoorlockapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.securedoorlockapp.navigation.AppNavHost
import com.example.securedoorlockapp.ui.theme.SecureDoorLockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecureDoorLockTheme {
                AppNav()
            }
        }
    }
}
