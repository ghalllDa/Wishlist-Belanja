package com.ghaldanurzahrah0016.wishlist_belanja.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ghaldanurzahrah0016.wishlist_belanja.database.BarangDao
import com.ghaldanurzahrah0016.wishlist_belanja.model.Barang
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel(private val dao: BarangDao): ViewModel() {

    fun insert(nama: String, jumlah: String, harga: String) {
        val barang = Barang(
            nama = nama,
            jumlah = jumlah,
            harga = harga
        )
        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(barang)
        }
    }

    suspend fun getBarang(id: Long): Barang? {
        return dao.getBarangById(id)
    }

    fun update(id: Long, nama: String, jumlah: String, harga: String) {
        val barang = Barang(
            id = id,
            nama = nama,
            jumlah = jumlah,
            harga = harga
        )
        viewModelScope.launch(Dispatchers.IO){
            dao.update(barang)
        }
    }

    fun delete(id: Long) {
        viewModelScope.launch(Dispatchers.IO){
            dao.deleteById(id)
        }
    }
}