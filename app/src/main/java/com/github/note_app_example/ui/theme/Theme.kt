package com.github.note_app_example.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

// TODO: migrate the whole app to Material 3 Theme

private val DarkColorPalette = darkColors(
    primary = Color.White,
    background = DarkGray,
    onBackground = Color.White,
    surface = LightGreen,
    onSurface = DarkGray
)

@Composable
fun NoteAppTheme(darkTheme: Boolean = true, content: @Composable () -> Unit) {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setNavigationBarColor(DarkGray)
        systemUiController.setStatusBarColor(DarkGray)
        systemUiController.isStatusBarVisible = false
    }
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}