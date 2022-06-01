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
import com.juandanielgarcia.myapplication.presentation.home.sharedComponents.ProfileCard
import com.juandanielgarcia.myapplication.presentation.home.sharedComponents.TopBar
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme


@Composable
fun PollsterScreen(
    navController: NavController,

    ) {
    Scaffold(
        topBar = {
            TopBar(title = "Inicio")
        }
    ) { innerPadding ->
        Body(
            modifier = Modifier.padding(innerPadding),
            navController = navController
        )
    }
}

@Composable
fun Body(modifier: Modifier = Modifier, navController: NavController) {
    Surface(
        color = Color.White,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileCard(Name = "Luis Angel Robles Niño", Role = "Encuestador")
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




