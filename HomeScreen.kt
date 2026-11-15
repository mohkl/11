package com.rfm.quran.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(nav: NavController) {
    Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(12.dp)) {
        Text("Quran", style = MaterialTheme.typography.headlineLarge)
        Text("تطبيق القرآن الكريم", style = MaterialTheme.typography.bodyLarge)
        Spacer(Modifier.height(16.dp))
        Button(onClick = { nav.navigate("reader/1") }, Modifier.fillMaxWidth()) { Text("فتح المصحف (الفاتحة)") }
        Button(onClick = { nav.navigate("settings") }, Modifier.fillMaxWidth()) { Text("الإعدادات") }
        Button(onClick = { nav.navigate("about") }, Modifier.fillMaxWidth()) { Text("حول التطبيق") }
    }
}
