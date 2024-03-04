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
fun Splash (navigateTo: (route: String) -> Unit){
    LaunchedEffect(key1 = true){
        delay(2000L)
        navigateTo(Screens.SplashScreen.Splash2.route)
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(id = R.color.white)
            ),
        horizontalAlignment =  Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

    Image(
            painter = painterResource(R.drawable.frame),
            contentDescription = null,

            modifier = Modifier
                .height(78.dp)
                .width(215.dp)

        )
    }
}