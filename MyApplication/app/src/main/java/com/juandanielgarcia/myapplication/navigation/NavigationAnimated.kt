package com.juandanielgarcia.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.presentation.home.adminHome.AdminScreen
import com.juandanielgarcia.myapplication.presentation.login.LoginScreen
import com.juandanielgarcia.myapplication.presentation.login.LoginViewModel


@Composable
fun NavigationAnimated() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Destinations.Login.route
    ) {
        composable(
            route = Destinations.Login.route
        ) {
            val viewModel: LoginViewModel = hiltViewModel()
            LoginScreen(
                state = viewModel.state.value,
                onLogin = viewModel::login,
                onDismissDialog = viewModel::hideErrorDialog
            )

        }

        composable(route = Destinations.AdminHome.route) {
            AdminScreen(navController = navController)
        }
    }

}


fun NavGraphBuilder.addLogin(
    navController: NavHostController
) {
    composable(
        route = Destinations.Login.route
    ) {
        val viewModel: LoginViewModel = hiltViewModel()

        if (viewModel.state.value.successLogin) {
            LaunchedEffect(key1 = Unit) {
                navController.navigate(
                    Destinations.AdminHome.route
                ) {
                    popUpTo(Destinations.Login.route) {
                        inclusive = true
                    }
                }
            }
        } else {
            LoginScreen(
                state = viewModel.state.value,
                onLogin = viewModel::login,
                onDismissDialog = viewModel::hideErrorDialog
            )
        }
    }
}

fun NavGraphBuilder.addAdminHome(
    navController: NavHostController
) {
    composable(
        route = Destinations.AdminHome.route
    ) {
        AdminScreen(navController = navController)
    }
}