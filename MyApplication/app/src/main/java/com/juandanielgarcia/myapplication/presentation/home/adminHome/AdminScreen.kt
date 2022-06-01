package com.juandanielgarcia.myapplication.presentation.home.adminHome

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.navigation.Destinations
import com.juandanielgarcia.myapplication.presentation.home.sharedComponents.*
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme

@Composable
fun AdminScreen(
    navController: NavController,
) {
    Scaffold(
        topBar = {
            TopBar(title = "Inicio")
        }
    ) { innerPadding ->
        Body(modifier = Modifier.padding(innerPadding), navController)
    }
}

@Composable
fun Body(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Surface(
        color = Color.White,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ProfileCard(Name = "Luis Angel Robles Niño", Role = "Administrador")
            Row() {
                ButtonCRUD(
                    description = "Dueño",
                    iconButton = Icons.Default.Person,
                    onClickAction = {
                        navController.navigate(Destinations.UserList.route)
                    }
                )
                ButtonCRUD(
                    description = "Mascota",
                    iconButton = Icons.Default.Pets,
                    onClickAction = {
                        navController.navigate(Destinations.PetList.route)
                    }
                )
            }
            Row() {
                ButtonCRUD(
                    description = "Encuestador",
                    iconButton = Icons.Default.PersonAdd,
                    onClickAction = {
                        navController.navigate(Destinations.PollsterList.route)
                    }
                )
                ButtonCRUD(
                    description = "Admin",
                    iconButton = Icons.Default.Engineering,
                    onClickAction = {
                        navController.navigate(Destinations.AdminList.route)
                    }
                )
            }

        }

    }

}


@Preview(showBackground = true, device = "id:pixel_4")
@Composable
fun PrevHomeScreen() {
    val navController = rememberNavController()
    MyApplicationTheme() {
        AdminScreen(navController)
    }
}
