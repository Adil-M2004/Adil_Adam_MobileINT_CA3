package com.example.securedoorlockapp.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val Purple = Color(0xFF6A1B9A)
private val LightColors = lightColorScheme(
    primary = Purple,
    secondary = Purple,
    tertiary = Purple
)

@Composable
fun MaterialTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography(),
        content = content
    )
}
