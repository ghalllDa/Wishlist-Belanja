package com.ghaldanurzahrah0016.wishlist_belanja

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ghaldanurzahrah0016.wishlist_belanja.navigation.SetupNavGraph
import com.ghaldanurzahrah0016.wishlist_belanja.ui.theme.Wishlist_BelanjaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Wishlist_BelanjaTheme {
                SetupNavGraph()
            }
        }
    }
}
