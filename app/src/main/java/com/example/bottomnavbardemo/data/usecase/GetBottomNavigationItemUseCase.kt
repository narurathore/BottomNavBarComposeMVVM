package com.example.bottomnavbardemo.data.usecase

import com.example.bottomnavbardemo.data.models.BottomBarItem
import com.example.bottomnavbardemo.data.repositoryInterface.BottomNavigationItemsRepository
import javax.inject.Inject

class GetBottomNavigationItemUseCase @Inject constructor(val bottomNavigationItemsRepository: BottomNavigationItemsRepository) {

    operator fun invoke(): List<BottomBarItem>{
        return bottomNavigationItemsRepository.getBottomNavigationItems()
    }
}