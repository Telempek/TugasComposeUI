package com.example.modul2.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = LoFiWhite,
    onPrimary = LoFiBlack,
    primaryContainer = LoFiDarkGray,
    onPrimaryContainer = LoFiLightGray,
    secondary = LoFiMidGray,
    onSecondary = LoFiWhite,
    tertiary = LoFiLightGray,
    background = LoFiBlack,
    surface = LoFiBlack,
    onBackground = LoFiWhite,
    onSurface = LoFiWhite
)

private val LightColorScheme = lightColorScheme(
    primary = LoFiBlack,
    onPrimary = LoFiWhite,
    primaryContainer = LoFiLightGray,
    onPrimaryContainer = LoFiDarkGray,
    secondary = LoFiMidGray,
    onSecondary = LoFiWhite,
    tertiary = LoFiDarkGray,
    background = LoFiBackground,
    surface = LoFiWhite,
    onBackground = LoFiBlack,
    onSurface = LoFiBlack
)

@Composable
fun Modul2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Set to false to apply Lo-Fi colors consistently
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
