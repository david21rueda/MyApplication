package com.juandanielgarcia.myapplication.presentation.home.sharedComponents

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.juandanielgarcia.myapplication.ui.theme.Orange

@Composable
fun ProfileCard(
    Name: String,
    Role: String,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp, vertical = 12.dp),
        elevation = 3.dp,
        shape = RoundedCornerShape(corner = CornerSize(25.dp))
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(12.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "Bienvenido",
                    style = MaterialTheme.typography.h5.copy(
                        fontWeight = FontWeight.Light
                    )
                )
                Text(
                    text = Name,
                    style = MaterialTheme.typography.h4.copy(
                        fontWeight = FontWeight.Bold
                    ),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = Role,
                    style = MaterialTheme.typography.h6.copy(
                        fontWeight = FontWeight.Light
                    )
                )
            }

        }
    }
}

@Composable
fun ButtonCRUD(
    description: String,
    iconButton: ImageVector,
    onClickAction: () -> Unit
) {
    Button(
        shape = RoundedCornerShape(25.dp),
        onClick = onClickAction,
        modifier = Modifier
            .padding(16.dp)
            .size(140.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Orange,
            contentColor = Color.White
        )
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Icon(
                imageVector = iconButton,
                contentDescription = null,
                modifier = Modifier.size(75.dp)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text(description, textAlign = TextAlign.Center)
        }
    }
}

@Composable
fun TopBar(
    title: String,
) {
    TopAppBar(
        title = {
            Text(text = title, maxLines = 2)
        }
    )
}






