package com.juandanielgarcia.myapplication.presentation.home.pollsterHome

import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.presentation.home.sharedComponents.ButtonCRUD
import com.juandanielgarcia.myapplication.presentation.home.sharedComponents.TopBar
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme


@Composable
fun PollsterScreen(
    navController: NavController,
    typeHomeScreen: String,

    ) {
    var title: String = ""
    if (typeHomeScreen == "Admin") {
        title = stringResource(id = R.string.admin)
    } else if (typeHomeScreen == "Pollster") {
        title = stringResource(id = R.string.pollster)
    } else if (typeHomeScreen == "User") {
        title = stringResource(id = R.string.user)
    }
    Scaffold(
        topBar = {
            TopBar(title = title, iconButton = Icons.Default.AccountCircle)
        }
    ) { innerPadding ->
        Body(
            modifier = Modifier.padding(innerPadding),
            typeHomeScreen = typeHomeScreen,
            navController = navController
        )
    }
}

@Composable
fun Body(modifier: Modifier = Modifier, typeHomeScreen: String, navController: NavController) {
    Surface(
        color = Color.White,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row() {
                ButtonCRUD(
                    description = "Dueño",
                    iconButton = Icons.Default.Person,
                    onClickAction = {/*TODO*/ })
                ButtonCRUD(
                    description = "Mascota",
                    iconButton = Icons.Default.Pets,
                    onClickAction = {/*TODO*/ })
            }

        }
    }
}




