package com.example.test.Session

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.R
import com.example.test.Session1.Screens


@Composable
fun ForgotPassword(navigateTo: (route: String) -> Unit) {
    val text1 = remember { mutableStateOf("") }
    val text2 = remember { mutableStateOf("") }
    val checkedState = remember { mutableStateOf(false) }
    var showPassword: Boolean by  remember { mutableStateOf(false) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(id = R.color.white),
            )
    ) {
        item {
            Text(
                text = "Forgot Password",
                color = colorResource(id = R.color.black),
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 20.dp, top = 50.dp, bottom = 10.dp)
            )
            Text(
                text = "Enter your email address",
                color = colorResource(id = R.color.Gray_2),
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 75.dp)
            )
            Column {
                Text(
                    text = "Email Address",
                    color = colorResource(id = R.color.Gray_2),
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, bottom = 10.dp)
                )
                Row {
                    OutlinedTextField(
                        text1.value,
                        { text1.value = it },
                        textStyle = TextStyle(fontSize = 20.sp),
                        shape = RoundedCornerShape(8.dp),
                        placeholder = {
                            Text(text = "*******@mail.com")
                        },
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                            .fillMaxWidth()
                    )
                }
            }
            Row {
                Button(
                    onClick = {navigateTo(Screens.Verification.route)},
                    colors = ButtonDefaults.buttonColors(colorResource(id = R.color.Gray_3)),
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier
                        .padding(top = 40.dp, start = 20.dp, end = 10.dp, bottom = 5.dp)
                        .fillMaxWidth()
                )
                {
                    Text("Send OTP", fontSize = 14.sp)

                }

            }
            Row {
                Text(
                    text = "Remember password? Back to",
                    fontSize = 12.sp,
                    color = colorResource(id = R.color.Gray_2),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 10.dp, start = 110.dp, bottom = 5.dp)
                )
                Text(
                    text = "Sign in",
                    fontSize = 12.sp,
                    color = colorResource(id = R.color.Gray_3),
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .clickable {navigateTo(Screens.LogIn.route)}
                )
            }

        }

    }

}