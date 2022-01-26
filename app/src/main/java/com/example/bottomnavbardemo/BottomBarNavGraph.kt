package com.example.bottomnavbardemo

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnavbardemo.data.models.BottomBarItem
import com.example.bottomnavbardemo.screens.HomeScreen
import com.example.bottomnavbardemo.screens.ProfileScreen
import com.example.bottomnavbardemo.screens.MoreScreen
import com.example.bottomnavbardemo.screens.TestHistoryScreen

@Composable
fun BottomBarNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarItem.Home.route
    ) {
        composable(route = BottomBarItem.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarItem.TestHistory.route) {
            TestHistoryScreen()
        }
        composable(route = BottomBarItem.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarItem.More.route) {
            MoreScreen()
        }
    }
}