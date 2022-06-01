package com.juandanielgarcia.myapplication.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.navigation.Destinations
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme


@Composable
fun SuccessRecoverScreen(
    navController: NavController,
) {
    Scaffold(
    ) { innerPadding ->
        BodySuccess(modifier = Modifier.padding(innerPadding), navController)
    }
}

@Composable
fun BodySuccess(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    Surface(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(1f)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(Modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.drawable.escudo_toledo),
                contentDescription = "Login Image",
                modifier = Modifier.size(200.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(Modifier.height(50.dp))
            Column(
                modifier = Modifier.padding(start = 15.dp, end = 15.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .fillMaxWidth(),
                    text = "Te enviamos un email para recuperar tu contraseña.",
                    style = MaterialTheme.typography.h5.copy(
                        fontWeight = FontWeight.Light
                    ),
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(50.dp))

                RoundedButton(
                    text = "Volver a iniciar de sesión",
                    displayProgressBar = false,
                    onClick = {
                        navController.navigate(Destinations.Login.route)
                    }
                )
            }
            Image(
                painter = painterResource(id = R.drawable.logo_toledo),
                contentDescription = "Login Image",
                modifier = Modifier.size(180.dp),
                contentScale = ContentScale.Fit
            )
        }

    }
}


@Preview(showBackground = true, device = "id:pixel_4")
@Composable
fun PrevSuccessRecoverScreen() {
    val navController = rememberNavController()
    MyApplicationTheme() {
        SuccessRecoverScreen(navController)
    }
}
