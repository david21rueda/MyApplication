package com.juandanielgarcia.myapplication.presentation.listFull.pollsterList

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.navigation.Destinations
import com.juandanielgarcia.myapplication.presentation.listFull.sharedComponents.TopBar
import com.juandanielgarcia.myapplication.presentation.listFull.sharedComponents.UserItem
import com.juandanielgarcia.myapplication.ui.theme.GreenAdd
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme
import com.juandanielgarcia.myapplication.ui.theme.White

@Composable
fun PoListScreen(
    navController: NavController,
    typeUserOfThisScreen: String,
) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Encuestadores",
                iconButton = R.drawable.back_icon,
                onClickBack = { navController.navigateUp() })
        },
        floatingActionButton = {
            HomeFab(
                onFabClicked = { navController.navigate(Destinations.CreatePollster.route) }
            )
        },
    ) { innerPadding ->
        FullList(

            navController = navController,
            modifier = Modifier.padding(innerPadding),
            typeUserOfThisScreen = typeUserOfThisScreen,

            )
    }
}

@Composable
fun FullList(
    modifier: Modifier = Modifier,
    typeUserOfThisScreen: String,
    navController: NavController,
    /*onDeleteUser: (user: User) -> Unit,
    onEditUser: (id: Int?) -> Unit,
    users: List<User> = emptyList()*/
) {
    Surface(
        color = MaterialTheme.colors.surface,
        modifier = modifier
    ) {
        LazyColumn {

            items(5) {
                UserItem(
                    onViewFullDetails = { navController.navigate(Destinations.DetailsPollster.route) },
                    Name = "Juan Daniel Garcia Peña",
                    Cedula = "1193356776",
                    Phone = "3123891276",
                    Address = "Calle 1 Barrio Colombia",
                )
            }
        }
    }
}

@Composable
fun HomeFab(
    modifier: Modifier = Modifier,
    onFabClicked: () -> Unit = {  }
) {
    FloatingActionButton(
        onClick = onFabClicked,
        modifier = modifier
            .height(52.dp)
            .widthIn(min = 52.dp),
        backgroundColor = GreenAdd,
        contentColor = White
    ) {
        Icon(imageVector = Icons.Outlined.Add, contentDescription = "Add")
    }
}