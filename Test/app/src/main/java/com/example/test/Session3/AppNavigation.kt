package com.example.test.Session3

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(navigateTo: (route: String) -> Unit) {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(
                        elevation = 8.dp,
                        clip = true
                    )
                    .clip(shape = RoundedCornerShape(0.dp)),
                color = Color.Blue
            ) {
                NavigationBar {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination

                    listOfNavItems.forEach { navItems ->
                        NavigationBarItem(
                            selected = currentDestination?.hierarchy?.any { it.route == navItems.route } == true,
                            onClick = {
                                navController.navigate(navItems.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            },
                            icon = {
                                Icon(
                                    imageVector = navItems.icon,
                                    contentDescription = null
                                )
                            },
                            label = {
                                Text(text = navItems.label)
                            }
                        )

                    }
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.HomeScreen.name,
            modifier = Modifier
                .padding(paddingValues)
                .background(Color.White)
        ) {
            composable(route = Screen.HomeScreen.name) {
                HomeScreen()
            }
            composable(route = Screen.WalletScreen.name) {
                WalletScreen()
            }
            composable(route = Screen.TrackScreen.name) {
                TrackScreen()
            }
            composable(route = Screen.ProfileScreen.name) {
                ProfileScreen()
            }
        }
    }
}
