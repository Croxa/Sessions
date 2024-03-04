package com.example.test.Session3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.R

@Composable
fun AddPaymentMethod(navigateTo: (route: String) -> Unit) {
    val text1 = remember { mutableStateOf("") }
    val text2 = remember { mutableStateOf("") }
    val checkedState = remember { mutableStateOf(false) }
    var showPassword: Boolean by remember { mutableStateOf(false) }
    var showPassword2: Boolean by remember { mutableStateOf(false) }
    var isDarkModeEnabled by remember { mutableStateOf(false) }

    LazyColumn(
    modifier = Modifier
        .fillMaxSize()
        .background(
            color = colorResource(id = R.color.white),
        )
    ) {
        item {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp)
                    .shadow(
                        elevation = 8.dp,
                        clip = true
                    ),
                shape = RoundedCornerShape(0.dp),
                color = Color.White
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 30.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.arrow),
                            contentDescription = null,

                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                                .padding( start = 20.dp, end = 5.dp)
                        )
                        Text(
                            text = "Add Payment method",
                            color = colorResource(id = R.color.Gray_4),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.ExtraBold,
                            fontFamily = FontFamily.SansSerif,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(horizontal = 16.dp,)
                        )

                    }
                }
            }
        }
    }
}
