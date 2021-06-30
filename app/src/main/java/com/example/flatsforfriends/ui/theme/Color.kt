package com.example.flatsforfriends.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val Green200 = Color(0xFF16BE45)
val Green500 = Color(0xFF008929)
val Black200 = Color(0xFF050505)
val Black500 = Color(0xFF303842)

val gradientGreen = Brush.horizontalGradient(
    colors = listOf(
        Green200,
        Green500
    )
)

val gradientBlack = Brush.horizontalGradient(
    colors = listOf(
        Black200,
        Black500
    )
)