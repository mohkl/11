package com.rfm.quran

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.*
import com.rfm.quran.ui.about.AboutScreen
import com.rfm.quran.ui.home.HomeScreen
import com.rfm.quran.ui.reader.ReaderScreen
import com.rfm.quran.ui.settings.SettingsScreen
import com.rfm.quran.ui.theme.QuranTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuranTheme {
                val nav = rememberNavController()
                NavHost(navController = nav, startDestination = "home") {
                    composable("home") { HomeScreen(nav) }
                    composable("reader/{surahId}") { back ->
                        val id = back.arguments?.getString("surahId")?.toIntOrNull() ?: 1
                        ReaderScreen(id)
                    }
                    composable("settings") { SettingsScreen(nav) }
                    composable("about") { AboutScreen(nav) }
                }
            }
        }
    }
}
