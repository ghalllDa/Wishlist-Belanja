package com.ghaldanurzahrah0016.wishlist_belanja.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ghaldanurzahrah0016.wishlist_belanja.database.BarangDao
import com.ghaldanurzahrah0016.wishlist_belanja.model.Barang
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel(dao: BarangDao) : ViewModel() {

    val data: StateFlow<List<Barang>> = dao.getBarang().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )
}