package com.example.test.Session3

import android.widget.ToggleButton
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test.R
import com.example.test.Session1.Screens

@Composable
fun ProfileScreen() {
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
                    Text(
                        text = "Profile",
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
            Row (modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)){
                Image(
                    painter = painterResource(R.drawable.fra),
                    contentDescription = null,

                    modifier = Modifier
                        .height(80.dp)
                        .width(80.dp)

                )
                Column {
                    Text(
                        text = "Hello Ken",
                        color = colorResource(id = R.color.black),
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding(start = 15.dp, top = 15.dp, bottom = 2.dp)
                    )
                    Row {
                        Text(
                            text = "Current balance: ",
                            color = colorResource(id = R.color.black),
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(start = 15.dp)
                        )
                        Text(
                            text = "N10,712:00",
                            color = colorResource(id = R.color.Gray_3),
                            fontSize = 14.sp,
                            modifier = Modifier
                                .padding(start = 3.dp)
                        )
                    }
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "Enable dark Mode",
                    fontWeight = FontWeight.ExtraBold,
                    color = colorResource(id = R.color.black),
                    fontSize = 18.sp,
                    modifier = Modifier.padding(start = 25.dp, end = 40.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Switch(
                    modifier = Modifier.padding(start = 95.dp),
                    checked = isDarkModeEnabled,
                    onCheckedChange = { isChecked ->
                        isDarkModeEnabled = isChecked
                    },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        checkedTrackColor = Color(0xFFD7D7D7),
                        uncheckedThumbColor = Color.White,
                        uncheckedTrackColor = Color(0xFFD7D7D7)
                    )
                )
            }


            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp, top = 20.dp)
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
                        .padding(vertical = 10.dp),
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.iconoirprofilecircled),
                            contentDescription = null,

                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                                .padding( start = 20.dp, end = 5.dp)
                        )
                        Column {
                            Text(
                                text = "Edit Profile",
                                color = colorResource(id = R.color.black),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 5.dp)
                            )
                            Text(
                                text = "Name, phone no, address, email ...",
                                color = colorResource(id = R.color.Gray_4),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(5.dp))
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
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
                        .padding(vertical = 10.dp),
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.group),
                            contentDescription = null,

                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                                .padding( start = 20.dp, end = 5.dp)
                        )
                        Column {
                            Text(
                                text = "Statements & Reports",
                                color = colorResource(id = R.color.black),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 5.dp)
                            )
                            Text(
                                text = "Download transaction details, orders, deliveries",
                                color = colorResource(id = R.color.Gray_4),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(5.dp))
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
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
                        .padding(vertical = 10.dp),
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.notification),
                            contentDescription = null,

                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                                .padding( start = 15.dp, end = 5.dp)
                        )
                        Column {
                            Text(
                                text = "Notification Settings",
                                color = colorResource(id = R.color.black),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 5.dp)
                            )
                            Text(
                                text = "mute, unmute, set location & tracking setting",
                                color = colorResource(id = R.color.Gray_4),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(5.dp))
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
                    .shadow(
                        elevation = 8.dp,
                        clip = true
                    ) ,
                shape = RoundedCornerShape(0.dp),
                color = Color.White,

            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(vertical = 10.dp),
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.wallet2),
                            contentDescription = null,

                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                                .padding( start = 20.dp, end = 5.dp)
                        )
                        Column {
                            Text(
                                text = "Card & Bank account settings",
                                color = colorResource(id = R.color.black),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 5.dp)
                            )
                            Text(
                                text = "change cards, delete card details.",
                                color = colorResource(id = R.color.Gray_4),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(5.dp))
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
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
                        .padding(vertical = 10.dp),
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.carbolift),
                            contentDescription = null,

                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                                .padding( start = 20.dp, end = 5.dp)
                        )
                        Column {
                            Text(
                                text = "Referrals",
                                color = colorResource(id = R.color.black),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 5.dp)
                            )
                            Text(
                                text = "check no of friends and earn",
                                color = colorResource(id = R.color.Gray_4),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(5.dp))
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
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
                        .padding(vertical = 10.dp),
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.map),
                            contentDescription = null,

                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                                .padding( start = 20.dp, end = 5.dp)
                        )
                        Column {
                            Text(
                                text = "About Us",
                                color = colorResource(id = R.color.black),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 5.dp)
                            )
                            Text(
                                text = "know more about us, terms and conditions",
                                color = colorResource(id = R.color.Gray_4),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp)
                            )

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.width(5.dp))
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, bottom = 10.dp)
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
                        .padding(vertical = 10.dp),
                ) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.icroun),
                            contentDescription = null,

                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                                .padding( start = 20.dp, end = 5.dp)
                        )
                        Column {
                            Text(
                                text = "Log Out",
                                color = colorResource(id = R.color.black),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                fontFamily = FontFamily.SansSerif,
                                modifier = Modifier
                                    .padding(start = 5.dp, top = 12.dp)
                            )

                        }
                    }
                }
            }
        }
    }
    }

