package com.rfm.quran.data.local.dao

import androidx.room.*
import com.rfm.quran.data.local.entity.AyahEntity
import com.rfm.quran.data.local.entity.ReadingProgressEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface QuranDao {
    @Query("SELECT * FROM ayahs WHERE surahId = :surahId ORDER BY ayahNumber")
    fun getAyahsBySurah(surahId: Int): Flow<List<AyahEntity>>

    @Query("SELECT * FROM ayahs WHERE text LIKE '%' || :query || '%'")
    suspend fun searchAyahs(query: String): List<AyahEntity>

    @Query("SELECT * FROM reading_progress WHERE id = 1")
    fun getLastRead(): Flow<ReadingProgressEntity?>

    @Upsert
    suspend fun saveLastRead(progress: ReadingProgressEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(ayahs: List<AyahEntity>)
}
