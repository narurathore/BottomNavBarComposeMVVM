package com.example.bottomnavbardemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.bottomnavbardemo.screens.BottomNavigationSystem
import com.example.bottomnavbardemo.ui.theme.BottomNavBarDemoTheme
import com.example.bottomnavbardemo.viewModels.BottomNavigationSystemViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    val viewModel: BottomNavigationSystemViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavBarDemoTheme {
                BottomNavigationSystem(viewModel)
            }
        }
    }
}
