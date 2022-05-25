package com.juandanielgarcia.myapplication.presentation.listFull.sharedComponents

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.juandanielgarcia.myapplication.R

@Composable
fun DefaultListScreen(
    typeListScreen: String,
    typeUserOfThisScreen: String,
) {
    var title: String = ""
    if (typeListScreen == "Admin") {
        title = stringResource(id = R.string.admin_list)
    } else if (typeListScreen == "Pollster") {
        title = stringResource(id = R.string.pollster_list)
    } else if (typeListScreen == "User") {
        title = stringResource(id = R.string.user_list)
    }else if (typeListScreen == "Pet") {
        title = stringResource(id = R.string.pet_list)
    }
    Scaffold(
        topBar = {
            TopBar(title = title, iconButton = Icons.Default.AccountCircle)
        }
    ) { innerPadding ->
        FullList(modifier = Modifier.padding(innerPadding), typeUserOfThisScreen = typeUserOfThisScreen)
    }
}

@Composable
fun FullList(
    modifier: Modifier = Modifier,
    typeUserOfThisScreen: String,
    /*onDeleteUser: (user: User) -> Unit,
    onEditUser: (id: Int?) -> Unit,
    users: List<User> = emptyList()*/
){
    Surface(
        color = MaterialTheme.colors.surface,
        modifier = modifier
    ) {
        LazyColumn {

            items(5) {
                UserItem(
                    onEditUser = {  },
                    onDeleteUser = {  },
                    typeUserOfThisScreen=typeUserOfThisScreen,
                    onViewFullDetails = {}
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
        backgroundColor = MaterialTheme.colors.primary
    ) {
        Icon(imageVector = Icons.Outlined.Add, contentDescription = "User")
    }
}
