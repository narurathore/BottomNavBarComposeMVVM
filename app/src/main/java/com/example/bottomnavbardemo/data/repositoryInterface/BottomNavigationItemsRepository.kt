package com.example.bottomnavbardemo.data.repositoryInterface

import com.example.bottomnavbardemo.data.models.BottomBarItem
import javax.inject.Inject

class BottomNavigationItemsRepository @Inject constructor(){
    fun getBottomNavigationItems(): List<BottomBarItem> {
        return listOf(
            BottomBarItem.Home,
            BottomBarItem.TestHistory,
            BottomBarItem.Profile,
            BottomBarItem.More,
        )
    }
}