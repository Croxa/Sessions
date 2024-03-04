package com.example.test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.test.Session.ForgotPassword
import com.example.test.Session.LoginIn
import com.example.test.Session.NewPassword
import com.example.test.Session.SignUp
import com.example.test.Session.Verification
import com.example.test.Session1.Onboarding.Onboarding_1
import com.example.test.Session1.Onboarding.Onboarding_3
import com.example.test.Session1.Onboarding.Onboarding_4
import com.example.test.Session1.Screens
import com.example.test.Session1.Splash.Splash
import com.example.test.Session1.Splash.Splash_2
import com.example.test.Session3.AddPaymentMethod
import com.example.test.Session3.AppNavigation

import com.example.test.ui.theme.TestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NestedNavigationExample()
                 }
            }
        }
    }
}

@Composable
fun NestedNavigationExample() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.Onboarding.route
    ) {
        navigation(
            startDestination = Screens.SplashScreen.Splash1.route,
            route = Screens.Onboarding.route
        ) {

            composable(route = Screens.SplashScreen.Splash1.route) {
                Splash {
                    navController.navigate(it)

                }
            }
            composable(route = Screens.SplashScreen.Splash2.route) {
                Splash_2 {
                    navController.navigate(it)

                }
            }
        }

        composable(route = Screens.Onboarding.Skip.route) {
            Onboarding_1 {
                navController.navigate(it)
            }
        }
        composable(route = Screens.Onboarding.Next.route) {
            Onboarding_3 {
                navController.navigate(it)
            }
        }
        composable(route = Screens.Onboarding1.route) {
            Onboarding_4 {
                navController.navigate(it)

            }
        }
        composable(route = Screens.LogIn.route) {
            LoginIn {
                navController.navigate(it)

            }
        }
        composable(route = Screens.SignUp.route) {
            SignUp {
                navController.navigate(it)

            }
        }
        composable(route = Screens.ForgotPassword.route) {
            ForgotPassword {
                navController.navigate(it)

            }
        }
        composable(route = Screens.ForgotPassword.route) {
            ForgotPassword {
                navController.navigate(it)

            }
        }
        composable(route = Screens.Verification.route) {
            Verification {
                navController.navigate(it)

            }
        }
        composable(route = Screens.NewPassword.route) {
            NewPassword {
                navController.navigate(it)

            }
        }

    }
}