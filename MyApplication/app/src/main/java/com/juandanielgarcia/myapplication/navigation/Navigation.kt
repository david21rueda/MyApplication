package com.juandanielgarcia.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.presentation.create.admin.CreateAdminScreen
import com.juandanielgarcia.myapplication.presentation.create.pet.CreatePetScreen
import com.juandanielgarcia.myapplication.presentation.create.pollster.CreatePollsterScreen
import com.juandanielgarcia.myapplication.presentation.create.user.CreateUserScreen
import com.juandanielgarcia.myapplication.presentation.home.adminHome.AdminScreen
import com.juandanielgarcia.myapplication.presentation.home.userHome.UserScreen
import com.juandanielgarcia.myapplication.presentation.listFull.adminList.AdListScreen
import com.juandanielgarcia.myapplication.presentation.details.pet.DetailsPet
import com.juandanielgarcia.myapplication.presentation.details.pet.DetailsPetVM
import com.juandanielgarcia.myapplication.presentation.details.pollster.DetailsPollster
import com.juandanielgarcia.myapplication.presentation.details.user.DetailsUser
import com.juandanielgarcia.myapplication.presentation.edit.UiEditScreen
import com.juandanielgarcia.myapplication.presentation.listFull.petList.PetListScreen
import com.juandanielgarcia.myapplication.presentation.listFull.pollsterList.PoListScreen
import com.juandanielgarcia.myapplication.presentation.listFull.userList.UsListScreen
import com.juandanielgarcia.myapplication.presentation.login.LoginScreenWOVM
import com.juandanielgarcia.myapplication.presentation.login.RecoverPasswordScreen
import com.juandanielgarcia.myapplication.presentation.login.SuccessRecoverScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.CreatePet.route) {
        composable(route = Destinations.Login.route) {
            LoginScreenWOVM(navController = navController)
        }
        composable(route = Destinations.AdminHome.route) {
            AdminScreen(navController = navController)
        }
        composable(route = Destinations.UserHome.route) {
            UserScreen(navController = navController)
        }
        composable(route = Destinations.AdminList.route) {
            AdListScreen(navController = navController, "Admin")
        }
        composable(route = Destinations.UserList.route) {
            UsListScreen(navController = navController, "Admin")
        }
        composable(route = Destinations.PetList.route) {
            PetListScreen(navController = navController, "Admin")
        }
        composable(route = Destinations.PollsterList.route) {
            PoListScreen(navController = navController, "Admin")
        }
        composable(route = Destinations.Edit.route) {
            UiEditScreen(navController = navController)
        }
        composable(route = Destinations.CreateAdmin.route) {
            CreateAdminScreen(navController = navController)
        }
        composable(route = Destinations.CreatePollster.route) {
            CreatePollsterScreen(navController = navController)
        }
        composable(route = Destinations.CreateUser.route) {
            CreateUserScreen(navController = navController)
        }
        composable(route = Destinations.CreatePet.route) {

            CreatePetScreen(navController = navController)
        }
        composable(route = Destinations.DetailsPollster.route) {
            DetailsPollster(navController = navController)
        }
        composable(route = Destinations.DetailsUser.route) {
            DetailsUser(navController = navController)
        }
        composable(route = Destinations.DetailsPet.route) {

            DetailsPet(navController = navController)
        }
        composable(route = Destinations.RecoverPassword.route) {
            RecoverPasswordScreen(navController = navController)
        }
        composable(route = Destinations.SuccessRecover.route) {
            SuccessRecoverScreen(navController = navController)
        }

    }
}

