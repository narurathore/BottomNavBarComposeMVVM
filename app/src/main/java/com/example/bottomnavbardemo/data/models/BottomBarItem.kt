package com.example.bottomnavbardemo.data.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import java.io.Serializable

sealed class BottomBarItem(
    val route: String,
    val title: String,
    val icon: ImageVector
): Serializable {
    object Home : BottomBarItem(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object TestHistory : BottomBarItem(
        route = "testHistory",
        title = "Test History",
        icon = Icons.Default.DateRange
    )

    object Profile : BottomBarItem(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.Person
    )

    object More : BottomBarItem(
        route = "more",
        title = "More",
        icon = Icons.Default.Menu
    )
}
