package com.ghaldanurzahrah0016.wishlist_belanja.navigation

const val KEY_ID_BARANG = "idBarang"

sealed class Screen (val route: String){
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_BARANG}"){
        fun withId(id: Long) = "detailScreen/$id"
    }
}