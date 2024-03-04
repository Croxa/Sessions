package com.example.test.Session1

sealed class Screens(val route : String) {

    object Onboarding1 : Screens("Onboarding_1")

    object Onboarding : Screens("Onboarding"){
        object Onboarding1: Screens("Onboarding_1")
        object Next : Screens("Onboarding_3")
        object Skip : Screens("Onboarding_4")
    }
    object SplashScreen : Screens("SplashScreen")
    {
        object Splash1 : Screens("Splash")
        object Splash2 : Screens("Splash_2")
    }

    object LogIn : Screens("LoginIn")
    object SignUp : Screens("SignUp")
    object ForgotPassword : Screens("ForgotPassword")
    object Verification : Screens("Verification")
    object NewPassword : Screens("NewPassword")

    object ProfileScreen : Screens("ProfileScreen")


}