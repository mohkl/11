package com.rfm.quran.ui.settings

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SettingsScreen(nav: NavController) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("الإعدادات", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(16.dp))
        Text("حجم الخط: (قيد التطوير)")
        Text("الوضع الداكن: يتبع النظام حالياً")
        Spacer(Modifier.height(16.dp))
        Button(onClick = { nav.popBackStack() }) { Text("رجوع") }
    }
}
