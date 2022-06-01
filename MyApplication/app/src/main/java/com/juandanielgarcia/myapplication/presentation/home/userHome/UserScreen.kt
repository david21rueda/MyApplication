package com.juandanielgarcia.myapplication.presentation.home.userHome

import android.widget.Space
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.navigation.Destinations
import com.juandanielgarcia.myapplication.presentation.details.shared.DetailPeopleCard
import com.juandanielgarcia.myapplication.presentation.home.sharedComponents.ButtonCRUD
import com.juandanielgarcia.myapplication.presentation.home.sharedComponents.TopBar
import com.juandanielgarcia.myapplication.presentation.listFull.sharedComponents.PetItem
import com.juandanielgarcia.myapplication.ui.theme.BlueLight
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme

@Composable
fun UserScreen(
    navController: NavController,

    ) {

    Scaffold(
    ) { innerPadding ->
        Body(
            modifier = Modifier.padding(innerPadding),
            navController = navController
        )
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
            .fillMaxSize()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            DetailPeopleCard(
                Name = "Juan Pablo Torres Alvarez",
                Cedula = "1192547687",
                Phone = "3122567143",
                Email = "email@email.com",
                Address = "calle 1 #1-2",
                More = "Observaciones",
                MoreInfo = "Ninguna"
            )
            Text(
                text = "Mascotas a cargo",
                style = MaterialTheme.typography.h6.copy(
                    fontWeight = FontWeight.Bold,
                ),
                color = BlueLight,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.padding( 5.dp))
            LazyColumn {
                items(3) {
                    PetItem(
                        onViewFullDetails = { navController.navigate(Destinations.DetailsPet.route) },
                        NamePet = "Pachoncito",
                        NameOwner = "Juan Daniel Garcia Peña",
                        CedulaOwner = "1193356776",
                        TypeAnimal = "Perro",
                        Breed = "Bulldog",
                        Address = "Calle 1 Barrio Colombia",
                    )
                }
            }
        }


    }
}
