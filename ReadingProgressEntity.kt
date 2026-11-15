package com.rfm.quran.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "reading_progress")
data class ReadingProgressEntity(
    @PrimaryKey val id: Int = 1,
    val lastSurahId: Int = 1,
    val lastAyahId: Int = 1
)
