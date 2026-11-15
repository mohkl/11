package com.rfm.quran.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rfm.quran.data.local.dao.QuranDao
import com.rfm.quran.data.local.entity.AyahEntity
import com.rfm.quran.data.local.entity.ReadingProgressEntity

@Database(entities = [AyahEntity::class, ReadingProgressEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun quranDao(): QuranDao
}
