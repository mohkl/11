package com.rfm.quran.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = IslamicGreen,
    secondary = SoftGold,
    background = CreamWhite
)
private val DarkColors = darkColorScheme(
    primary = SoftGold,
    secondary = IslamicGreen,
    background = DarkBg,
    surface = DarkSurface
)

@Composable
fun QuranTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        content = content
    )
}
