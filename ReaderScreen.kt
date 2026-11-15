package com.rfm.quran.ui.reader

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rfm.quran.data.local.entity.AyahEntity

@Composable
fun ReaderScreen(surahId: Int) {
    // ملاحظة: هنا يجب ربط ViewModel و Room لجلب الآيات
    // لغرض البناء، نعرض بيانات تجريبية
    val dummyAyahs = listOf(
        AyahEntity(1, surahId, 1, "بِسْمِ ٱللَّهِ ٱلرَّحْمَـٰنِ ٱلرَّحِيمِ"),
        AyahEntity(2, surahId, 2, "ٱلْحَمْدُ لِلَّهِ رَبِّ ٱلْعَـٰلَمِينَ")
    )
    LazyColumn(Modifier.fillMaxSize().padding(16.dp)) {
        items(dummyAyahs) { ayah ->
            Text(
                text = "${ayah.text} (${ayah.ayahNumber})",
                fontSize = 24.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Divider()
        }
    }
}
