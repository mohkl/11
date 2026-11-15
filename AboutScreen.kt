package com.rfm.quran.ui.about

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AboutScreen(nav: NavController) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Text("حول التطبيق", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(16.dp))
        Text("Quran")
        Text("المطور: rFM")
        Text("واتساب: +201027814323")
        Spacer(Modifier.height(16.dp))
        Button(onClick = { nav.popBackStack() }) { Text("رجوع") }
    }
}
