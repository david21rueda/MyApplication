package com.juandanielgarcia.myapplication.presentation.details.shared

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.outlined.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.juandanielgarcia.myapplication.ui.theme.BlueLight
import com.juandanielgarcia.myapplication.ui.theme.GreenAdd
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme
import com.juandanielgarcia.myapplication.ui.theme.White

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
        Icon(imageVector = Icons.Outlined.Check, contentDescription = "Check")
    }
}

@Composable
fun TopBar(
    title: String,
    iconButton: Int,
    onClickBack: () -> Unit = {},
    onEdit: () -> Unit = {},
    onDelete: () -> Unit = {},
    backGroundTint: Color=Color.White,
    contentTint: Color=Color.Black,
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
            IconButton(onClick = onEdit) {
                Icon(Icons.Default.Edit, contentDescription = null, tint = GreenAdd)
            }
            IconButton(onClick = onDelete) {
                Icon(Icons.Default.Delete, contentDescription = null, tint = Color.Red)
            }
        },
        backgroundColor = backGroundTint,
        contentColor = contentTint,
    )
}

@Composable
fun DetailPeopleCard(
    modifier: Modifier = Modifier,
    Name: String,
    Cedula: String,
    Phone: String,
    Email: String,
    Address: String,
    More: String,
    MoreInfo: String,
) {

    Box(contentAlignment = Alignment.Center) {
        Card(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(1f),
            elevation = 3.dp,
            shape = RoundedCornerShape(corner = CornerSize(25.dp))
        ) {
            Column(
                modifier = Modifier.padding(25.dp)
            ) {
                Text(
                    text = "Nombre",
                    style = MaterialTheme.typography.h5.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                    color = BlueLight,
                )
                Text(
                    text = Name,
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Medium,
                    )
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column() {
                        Text(
                            text = "Documento",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )

                        Text(
                            text = Cedula,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                    Spacer(modifier = Modifier.padding(20.dp))
                    Column() {
                        Text(
                            text = "Telefono",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )
                        Text(
                            text = Phone,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }
                Text(
                    text = "Email",
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                    color = BlueLight,
                )
                Text(
                    text = Email,
                    style = MaterialTheme.typography.body1.copy(
                        fontWeight = FontWeight.Medium,
                    )
                )
                Text(
                    text = "Direccion",
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                    color = BlueLight,
                )
                Text(
                    text = Address,
                    style = MaterialTheme.typography.body1.copy(
                        fontWeight = FontWeight.Medium,
                    )
                )
                Text(
                    text = More,
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Bold,
                    ),
                    color = BlueLight,
                )
                Text(
                    text = MoreInfo,
                    style = MaterialTheme.typography.body1.copy(
                        fontWeight = FontWeight.Medium,
                    )
                )
            }
        }
    }
}

