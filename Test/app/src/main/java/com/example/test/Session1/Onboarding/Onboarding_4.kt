package com.example.test.Session1.Onboarding

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.R
import com.example.test.Session1.Screens

@Composable
fun Onboarding_4(navigateTo: (route: String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(id = R.color.white)
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row() {
            Image(
                painter = painterResource(R.drawable.pana),
                contentDescription = null,

                modifier = Modifier
                    .height(346.dp)
                    .width(346.dp)

            )
        }
        Text(
            text = "Quick Delivery At Your",
            color = colorResource(id = R.color.primary),
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif,
        )
        Text(
            text = "Doorstep",
            color = colorResource(id = R.color.primary),
            fontSize = 24.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .padding(bottom = 5.dp)
        )
        Text(
            text = "Enjoy quick pick-up and delivery to your destination",
            color = colorResource(id = R.color.Body_regular),
            fontSize = 16.sp,


            )
        Text(
            text = "your destination",
            color = colorResource(id = R.color.Body_regular),
            fontSize = 16.sp,
            modifier = Modifier
                .padding(2.dp)
                .padding(2.dp)
        )
        Box(modifier = Modifier
            .padding(top = 80.dp, start = 10.dp, bottom = 20.dp))
        {
            Row {
                OutlinedButton(
                    onClick = { navigateTo(Screens.Onboarding.Next.route)},
                    shape = RoundedCornerShape(5.dp),
                    border = BorderStroke(
                        width = 1.dp,
                        color = colorResource(id = R.color.primary)
                    )
                ) {
                    Text(text = "Skip")
                }
                Spacer(modifier = Modifier.width(170.dp))

                Button(
                    onClick = { navigateTo(Screens.Onboarding.Skip.route)},
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.primary)),
                    shape = RoundedCornerShape(5.dp)

                )
                {

                    Text("Next", fontSize = 14.sp)

                }
            }
        }
    }
}
