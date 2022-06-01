package com.juandanielgarcia.myapplication.presentation.listFull.userList

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.navigation.Destinations
import com.juandanielgarcia.myapplication.presentation.listFull.sharedComponents.TopBar
import com.juandanielgarcia.myapplication.presentation.listFull.sharedComponents.UserItem
import com.juandanielgarcia.myapplication.ui.theme.GreenAdd
import com.juandanielgarcia.myapplication.ui.theme.White


@Composable
fun UsListScreen(
    navController: NavController,
    typeUserOfThisScreen: String,
) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Dueños",
                iconButton = R.drawable.back_icon,
                onClickBack = { navController.navigateUp() })
        },
        floatingActionButton = {
            HomeFab(
                onFabClicked = { navController.navigate(Destinations.CreateUser.route) }
            )
        },
    ) { innerPadding ->
        FullList(
            modifier = Modifier.padding(innerPadding),
            typeUserOfThisScreen = typeUserOfThisScreen,
            navController = navController
        )
    }
}

@Composable
fun FullList(
    modifier: Modifier = Modifier,
    navController: NavController,
    typeUserOfThisScreen: String,
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
                    onViewFullDetails = { navController.navigate(Destinations.DetailsUser.route) },
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
    onFabClicked: () -> Unit = { }
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