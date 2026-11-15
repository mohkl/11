package com.rfm.quran.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "ayahs", indices = [Index("surahId")])
data class AyahEntity(
    @PrimaryKey val id: Int, // 1..6236
    val surahId: Int,
    val ayahNumber: Int,
    val text: String,
    val tafsir: String? = null
)
