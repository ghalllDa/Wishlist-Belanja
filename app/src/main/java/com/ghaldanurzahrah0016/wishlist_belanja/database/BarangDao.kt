package com.ghaldanurzahrah0016.wishlist_belanja.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.ghaldanurzahrah0016.wishlist_belanja.model.Barang
import kotlinx.coroutines.flow.Flow

@Dao
interface BarangDao {

    @Insert
    suspend fun insert(barang: Barang)

    @Update
    suspend fun upadate(barang: Barang)

    @Query("SELECT * FROM barang ORDER BY nama DESC")
    fun getBarang(): Flow<List<Barang>>

    @Query("SELECT * FROM barang WHERE id = :id")
    suspend fun getBarangById(id : Long): Barang?

    @Query("DELETE FROM barang WHERE id = :id")
    suspend fun deleteById(id: Long)
}