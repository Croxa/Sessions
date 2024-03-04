package com.example.test.Session1.Onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.R
import com.example.test.Session1.Screens

@Composable
fun Onboarding_3(navigateTo: (route: String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(id = R.color.white)
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row {
            Image(
                painter = painterResource(R.drawable.rafiki_2),
                contentDescription = null,

                modifier = Modifier
                    .height(346.dp)
                    .width(346.dp)
                    .padding(bottom = 30.dp)

            )
        }
        Text(
            text = "Real-time Tracking",
            color = colorResource(id = R.color.primary),
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 5.dp))
        Text(
            text = "Track your packages/items from the comfort of your home till final destination",
            color = colorResource(id = R.color.Body_regular),
            textAlign = TextAlign.Center,
            fontSize = 16.sp)
        Box(modifier = Modifier
            .padding(top = 80.dp, start = 20.dp, bottom = 10.dp, end = 20.dp))
        {
            Row {
                Button(
                    onClick = {
                        navigateTo(Screens.SignUp.route)
                    },
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.primary)),
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                )
                {
                    Text("Sign Up", fontSize = 14.sp)

                }
            }
        }
        Row {
            Text(
                text = "Already have an account?",
                color = colorResource(id = R.color.Gray_2),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
            )
            Text(
                text = "Sign in",
                color = colorResource(id = R.color.primary),
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                modifier = Modifier
                    .clickable {navigateTo(Screens.LogIn.route)}

            )
        }


    }
}
