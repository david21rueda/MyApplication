package com.juandanielgarcia.myapplication.presentation.listFull.sharedComponents

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
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme


@Composable
fun TopBar(
    title: String,
    iconButton: ImageVector,
) {
    TopAppBar(
        title = {
            Text(text = title, maxLines = 1)
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = iconButton,
                    contentDescription = null,
                )
            }
        },
        actions = {
            IconButton(onClick = { /* TODO */ }) {
                Icon(Icons.Default.Search, contentDescription = null)
            }
        }

    )
}

@Composable
fun UserItem(
    modifier: Modifier = Modifier,
    onViewFullDetails: () -> Unit,
    onEditUser: () -> Unit,
    onDeleteUser: () -> Unit,
    typeUserOfThisScreen: String
) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 12.dp),
        elevation = 3.dp,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioMediumBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .size(80.dp)
                    .clickable {onViewFullDetails() },
                shape = CircleShape,
                backgroundColor = Color.Magenta,
                elevation = 3.dp
            ) {
                // Image goes here
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(12.dp),
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = "Juan Garcia",
                    style = MaterialTheme.typography.h5.copy(
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "1196738492",
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Light
                    )
                )
            }
            Row {
                if (typeUserOfThisScreen == "Admin") {
                    IconButton(onClick = onEditUser) {
                        Icon(
                            imageVector = Icons.Filled.Edit,
                            contentDescription = null,
                            tint = Color.Green
                        )
                    }

                    IconButton(onClick = onDeleteUser) {
                        Icon(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = null,
                            tint = Color.Red
                        )
                    }
                } else if (typeUserOfThisScreen == "Pollster") {
                    IconButton(onClick = onDeleteUser) {
                        Icon(
                            imageVector = Icons.Filled.Delete,
                            contentDescription = null,
                            tint = Color.Red
                        )
                    }
                }
            }

        }
    }


}

@Preview(showBackground = true, widthDp = 500)
@Composable
fun ToBarPreview() {
    MyApplicationTheme() {
        TopBar(title = "Admin", iconButton = Icons.Default.AccountCircle)
    }
}

/*@Preview(showBackground = true, widthDp = 500)
@Composable
fun UserItemPreview() {
    MyApplicationTheme() {
        UserItem(
            onEditUser = {},
            onDeleteUser = {},
            typeUserOfThisScreen = "Admin"
        )
    }
}*/



