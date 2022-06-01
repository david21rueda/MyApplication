package com.juandanielgarcia.myapplication.presentation.login

import android.graphics.drawable.VectorDrawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
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
fun RecoverPasswordScreen(
    navController: NavController,
) {
    Scaffold(
        topBar = {
            TopBar(title = "Recupera tu contraseña", iconButton = R.drawable.back_icon, onClick = {navController.navigateUp()})
        }
    ) { innerPadding ->
        BodyRecover(modifier = Modifier.padding(innerPadding), navController)
    }

}

@Composable
fun BodyRecover(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    val emailValue = rememberSaveable { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    Surface(
        modifier = Modifier
            .fillMaxSize(1f)
            .padding(16.dp)
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

                TransparentTextField(
                    textFieldValue = emailValue,
                    textLabel = "Ingresa tu correo electrónico para recuperar tu cuenta ",
                    keyboardType = KeyboardType.Email,
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    imeAction = ImeAction.Next
                )

                Spacer(Modifier.height(50.dp))

                RoundedButton(
                    text = "Recuperar Contraseña",
                    displayProgressBar = false,
                    onClick = {
                        navController.navigate(Destinations.SuccessRecover.route)
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

@Composable
fun TopBar(
    title: String,
    iconButton: Int,
    onClick: () -> Unit,
) {
    TopAppBar(
        title = {
            Text(text = title, maxLines = 2)
        },
        navigationIcon = {
            IconButton(onClick = onClick) {
                Icon(
                    painter = painterResource(id = iconButton),
                    contentDescription = null,
                )
            }
        }
    )
}


@Preview(showBackground = true, device = "id:pixel_4")
@Composable
fun PrevRecoverPasswordScreen() {
    val navController = rememberNavController()
    MyApplicationTheme() {
        RecoverPasswordScreen(navController)
    }
}
