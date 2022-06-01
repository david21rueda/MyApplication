package com.juandanielgarcia.myapplication.presentation.listFull.sharedComponents

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.ui.theme.BlueLight
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme


@Composable
fun TopBar(
    title: String,
    iconButton: Int,
    onClickBack: () -> Unit = {},
    onClickSearch: () -> Unit = {},
) {
    TopAppBar(
        title = {
            Text(text = title, maxLines = 2)
        },
        navigationIcon = {
            IconButton(onClick = onClickBack) {
                Icon(
                    painter = painterResource(id = iconButton),
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                )
            }
        },
        actions = {
            IconButton(onClick = onClickSearch) {
                Icon(Icons.Default.Search, contentDescription = null)
            }
        }
    )
}

@Composable
fun PetItem(
    modifier: Modifier = Modifier,
    onViewFullDetails: () -> Unit = {},
    NamePet: String,
    NameOwner: String,
    CedulaOwner: String,
    TypeAnimal: String,
    Breed: String,
    Address: String,
) {
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
                    .size(120.dp)
                    .clickable { onViewFullDetails() },
                shape = CircleShape,
                backgroundColor = Color.Magenta,
                elevation = 3.dp
            ) {
                Image(
                    painterResource(R.drawable.perro),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(5.dp),
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = NamePet,
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                    color = BlueLight,
                )
                Text(
                    text = Breed,
                    style = MaterialTheme.typography.body2.copy(
                        fontWeight = FontWeight.Light
                    )
                )
                Text(
                    text = TypeAnimal,
                    style = MaterialTheme.typography.body2.copy(
                        fontWeight = FontWeight.Light
                    )
                )

                Text(
                    text = "Dueño: $NameOwner CC: $CedulaOwner",
                    style = MaterialTheme.typography.body2.copy(
                        fontWeight = FontWeight.Medium
                    )
                )
                Row() {
                    Icon(
                        imageVector = Icons.Default.Place,
                        contentDescription = "Icon Place",
                        tint = BlueLight
                    )
                    Text(
                        text = Address,
                        style = MaterialTheme.typography.body1.copy(
                            fontWeight = FontWeight.Light
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun UserItem(
    modifier: Modifier = Modifier,
    Name: String,
    Cedula: String,
    Phone: String,
    Address: String,
    onViewFullDetails: () -> Unit ={},
) {
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
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(12.dp),
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = Name,
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                    color = BlueLight,
                    modifier = Modifier.clickable { onViewFullDetails() },
                )
                Text(
                    text = "CC: $Cedula",
                    style = MaterialTheme.typography.body2.copy(
                        fontWeight = FontWeight.Light
                    )
                )
                Text(
                    text = "Telefono: $Phone",
                    style = MaterialTheme.typography.body2.copy(
                        fontWeight = FontWeight.Light
                    )
                )
                Row() {
                    Icon(
                        imageVector = Icons.Default.Place,
                        contentDescription = "Icon Place",
                        tint = BlueLight
                    )
                    Text(
                        text = Address,
                        style = MaterialTheme.typography.body1.copy(
                            fontWeight = FontWeight.Light
                        )
                    )
                }
            }
        }
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



