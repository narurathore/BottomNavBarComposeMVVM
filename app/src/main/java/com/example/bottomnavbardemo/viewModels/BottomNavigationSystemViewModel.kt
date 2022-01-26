package com.example.bottomnavbardemo.viewModels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.bottomnavbardemo.data.models.BottomBarItem
import com.example.bottomnavbardemo.data.usecase.GetBottomNavigationItemUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BottomNavigationSystemViewModel @Inject constructor(getBottomNavigationItem: GetBottomNavigationItemUseCase): ViewModel() {

    private var bottomBarItemList = mutableListOf<BottomBarItem>()

    private var currentSelectedItem = mutableStateOf<BottomBarItem>(BottomBarItem.Home)

    init {
        bottomBarItemList.addAll(getBottomNavigationItem())
        if (bottomBarItemList.isNotEmpty()) {
            currentSelectedItem.value = bottomBarItemList[0]
        }
    }

    fun getBottomBarItemList() : List<BottomBarItem>{
        bottomBarItemList.let {
            return it
        }
    }

    fun bottomBarItemClicked(bottomBarItem: BottomBarItem){
        currentSelectedItem.value = bottomBarItem

    }

    fun getCurrentSelectedItem() = currentSelectedItem

}