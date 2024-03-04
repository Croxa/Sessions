package com.example.test.Session3

import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.test.R



data class NavItems(
    val label: String,
    val icon: ImageVector,
    val route:String)

val listOfNavItems = listOf(
    NavItems(
        label = "Home",
        icon = Icons.Default.Home,
        route = Screen.HomeScreen.name
    ),
    NavItems(
        label = "Wallet",
        icon = Icons.Filled.ShoppingCart,
        route = Screen.WalletScreen.name
    ),
    NavItems(
        label = "Track",
        icon = Icons.Filled.Build,
        route = Screen.TrackScreen.name
    ),
    NavItems(
        label = "Profile",
        icon = Icons.Filled.AccountCircle,
        route = Screen.ProfileScreen.name
    ),


)