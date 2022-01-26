package com.example.bottomnavbardemo.screens

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.rememberNavController
import com.example.bottomnavbardemo.BottomBarNavGraph
import com.example.bottomnavbardemo.data.models.BottomBarItem
import com.example.bottomnavbardemo.viewModels.BottomNavigationSystemViewModel

@Composable
fun BottomNavigationSystem(viewModel: BottomNavigationSystemViewModel) {

    val navController = rememberNavController()
    Scaffold(
        topBar = { TopAppBar(
            title = { Text(text = viewModel.getCurrentSelectedItem().value.title)},
            backgroundColor = Color.Blue,
            contentColor = Color.White,
            elevation = 12.dp)
        },
        bottomBar = { BottomBar(viewModel = viewModel, onClick = {
            viewModel.bottomBarItemClicked(it)
            navController.navigate(it.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true
            }
        }) },
    ) {
        BottomBarNavGraph(navController = navController)
    }
}



@Composable
fun BottomBar(viewModel: BottomNavigationSystemViewModel, onClick: (BottomBarItem) -> Unit) {

    BottomNavigation {
        viewModel.getBottomBarItemList().forEach { screen ->
            AddItem(
                screen = screen,
                isSelected = screen.route == viewModel.getCurrentSelectedItem().value.route,
                onClick = onClick
            )
        }
    }
}

@Composable
fun RowScope.AddItem(
    screen: BottomBarItem,
    isSelected: Boolean = false,
    onClick: (BottomBarItem) -> Unit
) {
    BottomNavigationItem(
        label = {
            Text(text = screen.title)
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = screen.title
            )
        },
        selected = isSelected,
        onClick = {
            onClick(screen)
        }
    )
}













