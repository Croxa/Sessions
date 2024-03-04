package com.example.test.Session

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.test.R
import com.example.test.Session1.Screens
import com.example.test.data.model.UserState


@Composable
fun SignUp ( viewModel: SupabaseAuthViewModel = viewModel(), navigateTo: (route: String) -> Unit) {
    val context = LocalContext.current
    val userState by viewModel.userState
    var userEmail by remember { mutableStateOf("") }
    var userPassword by remember { mutableStateOf("") }
    var currentUserState by remember { mutableStateOf("") }


    val text1 = remember { mutableStateOf("") }
    val text2 = remember { mutableStateOf("") }
    val text5 = remember { mutableStateOf("") }
    val checkedState = remember { mutableStateOf(false) }
    var showPassword: Boolean by  remember { mutableStateOf(false) }
    var showPassword2: Boolean by  remember { mutableStateOf(false) }


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(id = R.color.white),
            )
    ) {
        item {
            Text(
                text = "Create an account",
                color = colorResource(id = R.color.black),
                fontSize = 24.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.SansSerif,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 20.dp, top = 50.dp, bottom = 10.dp)
            )
            Text(
                text = "Complete the sign up process to get started",
                color = colorResource(id = R.color.Gray_2),
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 30.dp)
            )
            Column {
                Text(
                    text = "Full name",
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
                            Text(text = "Ivanov Ivan")
                        },

                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                            .fillMaxWidth()
                    )
                }
            }
            Column {
                Text(
                    text = "Phone Number",
                    color = colorResource(id = R.color.Gray_2),
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, bottom = 10.dp)
                )
                Row {
                    OutlinedTextField(
                        text2.value,
                        { text2.value = it },
                        textStyle = TextStyle(fontSize = 20.sp),
                        shape = RoundedCornerShape(8.dp),
                        placeholder = {
                            Text(text = "+7(999)999-99-99")
                        },
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                            .fillMaxWidth()
                    )
                }
            }
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
                        value = userEmail,
                        onValueChange = {
                            userEmail = it
                        },
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
            Column {
                Text(
                    text = "Password",
                    color = colorResource(id = R.color.Gray_2),
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, bottom = 10.dp)
                )
                Row {
                    OutlinedTextField(
                        value = userPassword,
                        onValueChange = {
                            userPassword = it
                        },
                        textStyle = TextStyle(fontSize = 20.sp),
                        shape = RoundedCornerShape(8.dp),
                        placeholder = {
                            Text(text = "***********")
                        },
                        visualTransformation = if (showPassword) {
                            VisualTransformation.None
                        } else {
                            PasswordVisualTransformation()
                        },
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                            .fillMaxWidth(),
                        trailingIcon = {
                            IconButton(onClick = { showPassword = !showPassword }) {
                                Image(
                                    painter = painterResource(R.drawable.eye),
                                    contentDescription = null,

                                    modifier = Modifier
                                        .height(18.dp)
                                        .width(18.dp)

                                )
                            }
                        }
                    )
                }
                when (userState) {
                    is UserState.Loading -> {

                    }

                    is UserState.Success -> {
                        val message = (userState as UserState.Success).message
                        currentUserState = message
                    }

                    is UserState.Error -> {
                        val message = (userState as UserState.Error).message
                        currentUserState = message
                    }
                }
            }
            Column {
                Text(
                    text = "Confirm Password",
                    color = colorResource(id = R.color.Gray_2),
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(start = 20.dp, bottom = 10.dp)
                )
                Row {
                    OutlinedTextField(
                        value = text5.value,
                        onValueChange = { text5.value = it },
                        textStyle = TextStyle(fontSize = 20.sp),
                        shape = RoundedCornerShape(8.dp),
                        placeholder = {
                            Text(text = "***********")
                        },
                        visualTransformation = if (showPassword2) {
                            VisualTransformation.None
                        } else {
                            PasswordVisualTransformation()
                        },
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp, bottom = 20.dp)
                            .fillMaxWidth(),
                        trailingIcon = {
                            IconButton(onClick = { showPassword2 = !showPassword2 }) {
                                Image(
                                    painter = painterResource(R.drawable.eye),
                                    contentDescription = null,

                                    modifier = Modifier
                                        .height(18.dp)
                                        .width(18.dp)

                                )
                            }
                        }
                    )

                }
                Row(
                    horizontalArrangement = Arrangement.Center
                ){
                    Checkbox(
                        checked = checkedState.value,
                        onCheckedChange = { checkedState.value = it },
                        modifier = Modifier
                            .padding(top = 16.dp, start = 20.dp, end = 20.dp)
                            .height(16.dp)
                            .width(16.dp),
                        colors  = CheckboxDefaults.colors((colorResource(id  = R.color.Gray_3)),
                            uncheckedColor = colorResource(id = R.color.Gray_3)
                        ),


                        )
                    Text(
                        text = "By ticking this box, you agree to our Terms and conditions and private policy",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.Gray_2),
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(top = 15.dp, end = 20.dp)
                    )

                }
                Row {
                    Button(
                        onClick = {
                            viewModel.signUp(
                            context,
                            userEmail,
                            userPassword,)
                            navigateTo(Screens.LogIn.route)},
                        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.Gray_3)),
                        shape = RoundedCornerShape(5.dp),
                        modifier = Modifier
                            .padding(top = 20.dp, start = 20.dp, end = 10.dp, bottom = 5.dp)
                            .fillMaxWidth()
                    )
                    {
                        Text("Sign Up", fontSize = 14.sp)

                    }

                }
                Row {
                    Text(
                        text = "Already have an account?",
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

                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "or sign in using",
                        fontSize = 12.sp,
                        color = colorResource(id = R.color.Gray_2),
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                    Image(
                        painter = painterResource(R.drawable.akar),
                        contentDescription = null,
                        modifier = Modifier
                            .height(25.dp)
                            .width(25.dp)
                            .padding(top = 10.dp)
                    )
                }

            }


        }

    }
}

