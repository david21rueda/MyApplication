package com.juandanielgarcia.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.presentation.home.adminHome.AdminScreen
import com.juandanielgarcia.myapplication.presentation.home.userHome.UserScreen
import com.juandanielgarcia.myapplication.presentation.listFull.adminList.AdListScreen
import com.juandanielgarcia.myapplication.presentation.listFull.edit.UiEditScreen
import com.juandanielgarcia.myapplication.presentation.listFull.petList.PetListScreen
import com.juandanielgarcia.myapplication.presentation.listFull.pollsterList.PoListScreen
import com.juandanielgarcia.myapplication.presentation.listFull.userList.UsListScreen
import com.juandanielgarcia.myapplication.presentation.login.LoginScreen
import com.juandanielgarcia.myapplication.presentation.login.LoginScreenWOVM

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.Login.route) {
        composable(route = Destinations.Login.route) {
            LoginScreenWOVM(navController = navController)
        }
        composable(route = Destinations.AdminHome.route) {
            AdminScreen(navController = navController)
        }
        composable(route = Destinations.UserHome.route) {
            UserScreen(navController = navController, typeHomeScreen = "User")
        }
        composable(route = Destinations.AdminList.route) {
            AdListScreen(navController = navController,"Admin")
        }
        composable(route = Destinations.UserList.route) {
            UsListScreen(navController = navController,"Admin")
        }
        composable(route = Destinations.PetList.route) {
            PetListScreen(navController = navController,"Admin")
        }
        composable(route = Destinations.PollsterList.route) {
            PoListScreen(navController = navController,"Admin")
        }
        composable(route = Destinations.Edit.route) {
            UiEditScreen(navController = navController)
        }
    }
}

