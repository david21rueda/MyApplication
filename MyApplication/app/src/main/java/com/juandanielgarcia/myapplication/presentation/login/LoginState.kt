package com.juandanielgarcia.myapplication.presentation.login

import androidx.annotation.StringRes

data class LoginState(
    val email: String="",
    val password: String="",
    val successLogin: Boolean = false,
    @StringRes val errorMessage: Int?=null,
)
