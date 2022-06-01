package com.juandanielgarcia.myapplication.presentation.details.admin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.presentation.details.shared.*
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme

@Composable
fun DetailsAdmin(
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Administrador en detalle",
                iconButton = R.drawable.back_icon,
                onClickBack = { navController.navigateUp() })
        },
        floatingActionButton = {
            HomeFab(
                onFabClicked = { }
            )
        },
    ) { innerPadding ->
        DetailPeopleCard(
            modifier = Modifier.padding(innerPadding),
            Name = "Juan Pablo Torres Alvarez",
            Cedula = "1192547687",
            Phone = "3122567143",
            Email = "email@email.com",
            Address = "calle 1 #1-2",
            More = "Rol",
            MoreInfo = "Administrador",
        )
    }
}




