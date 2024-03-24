package com.dzerok1.learnjapanese.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColors = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
    tertiary = md_theme_light_tertiary,
    onTertiary = md_theme_light_onTertiary,
    tertiaryContainer = md_theme_light_tertiaryContainer,
    onTertiaryContainer = md_theme_light_onTertiaryContainer,
    error = md_theme_light_error,
    errorContainer = md_theme_light_errorContainer,
    onError = md_theme_light_onError,
    onErrorContainer = md_theme_light_onErrorContainer,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
    outline = md_theme_light_outline,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
)


private val DarkColors = darkColorScheme(
    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    primaryContainer = md_theme_dark_primaryContainer,
    onPrimaryContainer = md_theme_dark_onPrimaryContainer,
    secondary = md_theme_dark_secondary,
    onSecondary = md_theme_dark_onSecondary,
    secondaryContainer = md_theme_dark_secondaryContainer,
    onSecondaryContainer = md_theme_dark_onSecondaryContainer,
    tertiary = md_theme_dark_tertiary,
    onTertiary = md_theme_dark_onTertiary,
    tertiaryContainer = md_theme_dark_tertiaryContainer,
    onTertiaryContainer = md_theme_dark_onTertiaryContainer,
    error = md_theme_dark_error,
    errorContainer = md_theme_dark_errorContainer,
    onError = md_theme_dark_onError,
    onErrorContainer = md_theme_dark_onErrorContainer,
    background = md_theme_dark_background,
    onBackground = md_theme_dark_onBackground,
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,
    surfaceVariant = md_theme_dark_surfaceVariant,
    onSurfaceVariant = md_theme_dark_onSurfaceVariant,
    outline = md_theme_dark_outline,
    inverseOnSurface = md_theme_dark_inverseOnSurface,
    inverseSurface = md_theme_dark_inverseSurface,
    inversePrimary = md_theme_dark_inversePrimary,
    surfaceTint = md_theme_dark_surfaceTint,
    outlineVariant = md_theme_dark_outlineVariant,
    scrim = md_theme_dark_scrim,
)

@Immutable
data class CustomColors(
    val seed: Color,
    val customColor1: Color,
    val customColor2: Color,
    val customColor3: Color,
    val customColor4: Color,
    val onSeed: Color,
    val onCustomColor1: Color,
    val onCustomColor2: Color,
    val onCustomColor3: Color,
    val onCustomColor4: Color,
    val seedContainer: Color,
    val customColor1Container: Color,
    val customColor2Container: Color,
    val customColor3Container: Color,
    val customColor4Container: Color,
    val onSeedContainer: Color,
    val onCustomColor1Container: Color,
    val onCustomColor2Container: Color,
    val onCustomColor3Container: Color,
    val onCustomColor4Container: Color,
)

private val CustomLightColors = CustomColors(
    seed = seed,
    customColor1 = light_CustomColor1,
    customColor2 = light_CustomColor3,
    customColor3 = light_CustomColor5,
    customColor4 = light_CustomColor6,
    onSeed = customColor1,
    onCustomColor1 = light_onCustomColor1,
    onCustomColor2 = light_onCustomColor3,
    onCustomColor3 = light_onCustomColor5,
    onCustomColor4 = light_onCustomColor6,
    seedContainer = customColor3,
    customColor1Container = light_CustomColor1Container,
    customColor2Container = light_CustomColor3Container,
    customColor3Container = light_CustomColor5Container,
    customColor4Container = light_CustomColor6Container,
    onSeedContainer = customColor5,
    onCustomColor1Container = light_onCustomColor1Container,
    onCustomColor2Container = light_onCustomColor3Container,
    onCustomColor3Container = light_onCustomColor5Container,
    onCustomColor4Container = light_onCustomColor6Container,
)

private val CustomDarkColors = CustomColors(
    seed = customColor6,
    customColor1 = dark_CustomColor1,
    customColor2 = dark_CustomColor3,
    customColor3 = dark_CustomColor5,
    customColor4 = dark_CustomColor6,
    onSeed = customColor7,
    onCustomColor1 = dark_onCustomColor1,
    onCustomColor2 = dark_onCustomColor3,
    onCustomColor3 = dark_onCustomColor5,
    onCustomColor4 = dark_onCustomColor6,
    seedContainer = customColor8,
    customColor1Container = dark_CustomColor1Container,
    customColor2Container = dark_CustomColor3Container,
    customColor3Container = dark_CustomColor5Container,
    customColor4Container = dark_CustomColor6Container,
    onSeedContainer = customColor9,
    onCustomColor1Container = dark_onCustomColor1Container,
    onCustomColor2Container = dark_onCustomColor3Container,
    onCustomColor3Container = dark_onCustomColor5Container,
    onCustomColor4Container = dark_onCustomColor6Container,
)

val LocalCustomColors = staticCompositionLocalOf {
    CustomColors(
        seed = Color.Unspecified,
        customColor1 = Color.Unspecified,
        customColor2 = Color.Unspecified,
        customColor3 = Color.Unspecified,
        customColor4 = Color.Unspecified,
        onSeed = Color.Unspecified,
        onCustomColor1 = Color.Unspecified,
        onCustomColor2 = Color.Unspecified,
        onCustomColor3 = Color.Unspecified,
        onCustomColor4 = Color.Unspecified,
        seedContainer = Color.Unspecified,
        customColor1Container = Color.Unspecified,
        customColor2Container = Color.Unspecified,
        customColor3Container = Color.Unspecified,
        customColor4Container = Color.Unspecified,
        onSeedContainer = Color.Unspecified,
        onCustomColor1Container = Color.Unspecified,
        onCustomColor2Container = Color.Unspecified,
        onCustomColor3Container = Color.Unspecified,
        onCustomColor4Container = Color.Unspecified,
    )
}

@Composable
fun LearnJapaneseTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColors
        else -> LightColors
    }

    val customColorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }

        darkTheme -> CustomDarkColors
        else -> CustomLightColors
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

//    MaterialTheme(
//        colorScheme = colorScheme,
//        typography = Typography,
//        content = content
//    )

    CompositionLocalProvider(
LocalCustomColors provides customColorScheme
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}

object LearnJapaneseTheme {
    val colors: CustomColors
        @Composable
        get() = LocalCustomColors.current
}