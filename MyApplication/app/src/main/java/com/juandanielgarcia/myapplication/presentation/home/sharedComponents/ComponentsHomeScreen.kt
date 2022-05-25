package com.juandanielgarcia.myapplication.presentation.home.sharedComponents

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp


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
            backgroundColor = Color(49,142,255,255),
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
    iconButton: ImageVector,
) {
    TopAppBar(
        title = {
            Text(text = title, maxLines = 2)
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = iconButton,
                    contentDescription = null,
                )
            }
        }
    )
}




