package com.example.bottomnavbardemo.screens

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.example.bottomnavbardemo.BlankView
import com.example.bottomnavbardemo.data.models.BottomBarItem

@Composable
fun ProfileScreen() {
    AndroidView(factory = {
        return@AndroidView BlankView(it, BottomBarItem.Profile)
    }, modifier = Modifier.fillMaxHeight().fillMaxWidth())
}