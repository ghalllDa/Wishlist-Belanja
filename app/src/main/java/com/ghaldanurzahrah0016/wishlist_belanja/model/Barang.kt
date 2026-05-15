package com.ghaldanurzahrah0016.wishlist_belanja.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "barang")
data class Barang(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val nama: String,
    val jumlah: String,
    val harga: String
)
