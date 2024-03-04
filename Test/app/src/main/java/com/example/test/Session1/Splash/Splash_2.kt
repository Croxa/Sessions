package com.example.test.Session1.Splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.test.R
import com.example.test.Session1.Screens
import kotlinx.coroutines.delay

@Composable
fun Splash_2 (navigateTo: (route: String) -> Unit){
    LaunchedEffect(key1 = true){
        delay(2000L)
        navigateTo(Screens.Onboarding.Onboarding1.route) }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(id = R.color.primary)
            ),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Image(
            painter = painterResource(R.drawable.splash_2),
            contentDescription = null,

            modifier = Modifier
                .height(78.dp)
                .width(215.dp)

        )
    }
}