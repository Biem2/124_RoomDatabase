package com.example.a124_roomdatabase.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface SiswaDao {
    val OnConflictStragery: Any

    @Query(value = "SELECT * from tbSiswa ORDER BY nama ASC")
    fun getAllSiswa() : Flow<List<Siswa>>

    @Insert(onConflict = OnConflictStragery.IGNORE)
    suspend fun Insert(Siswa : siswa)
}