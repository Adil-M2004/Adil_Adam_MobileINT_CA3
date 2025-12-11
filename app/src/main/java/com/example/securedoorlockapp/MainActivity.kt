package com.example.securedoorlockapp

import android.os.Bundle
<<<<<<< HEAD
import android.util.Log
=======
>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
<<<<<<< HEAD
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.navigation.compose.rememberNavController
import com.example.securedoorlockapp.navigation.AppNav

private const val TAG = "MainActivity"

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
=======
import androidx.navigation.compose.rememberNavController
import com.example.securedoorlockapp.navigation.AppNav

>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
<<<<<<< HEAD
                    val windowSizeClass = calculateWindowSizeClass(this)
                    val navController = rememberNavController()
                    AppNav(
                        navController = navController,
                        windowSizeClass = windowSizeClass
                    )
=======
                    val navController = rememberNavController()
                    AppNav(navController = navController)
>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd
                }
            }
        }
    }
<<<<<<< HEAD

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }
}
=======
}
>>>>>>> 4e068bd91d321fa86227a28598f99b4fd177a0fd
