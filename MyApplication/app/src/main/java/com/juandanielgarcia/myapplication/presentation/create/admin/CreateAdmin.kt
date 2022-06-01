package com.juandanielgarcia.myapplication.presentation.create.admin

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.presentation.create.shared.*
import com.juandanielgarcia.myapplication.ui.theme.GreenAdd
import com.juandanielgarcia.myapplication.ui.theme.White


@Composable
fun CreateAdminScreen(
    navController: NavController
) {

    Scaffold(
        topBar = {
            TopBar(
                title = "Crear Administrador",
                iconButton = R.drawable.back_icon,
                onClickBack = { navController.navigateUp() },
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                backgroundColor = GreenAdd,
                contentColor = White
            ) {
                Icon(imageVector = Icons.Default.Check, contentDescription = null)
            }
        }
    ) { innerPadding ->
        Body(modifier = Modifier.padding(innerPadding), navController)
    }
}

@Composable
fun Body(
    modifier: Modifier = Modifier,
    navController: NavController,
) {
    val nameValue = rememberSaveable { mutableStateOf("") }
    val cedulaValue = rememberSaveable { mutableStateOf("") }
    val phoneValue = rememberSaveable { mutableStateOf("") }
    val emailValue = rememberSaveable { mutableStateOf("") }
    val addressValue = rememberSaveable { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    Surface(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier.padding(horizontal = 25.dp)
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
            ) {
                TransparentTextField(
                    textFieldValue = nameValue,
                    textLabel = "Nombres",
                    keyboardType = KeyboardType.Text,
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    imeAction = ImeAction.Next
                )
                Spacer(Modifier.height(15.dp))
                TransparentTextField(
                    textFieldValue = cedulaValue,
                    textLabel = "Documento",
                    keyboardType = KeyboardType.Text,
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    imeAction = ImeAction.Next
                )
                Spacer(Modifier.height(15.dp))
                TransparentTextField(
                    textFieldValue = phoneValue,
                    textLabel = "Telefono",
                    keyboardType = KeyboardType.Number,
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    imeAction = ImeAction.Next
                )
                Spacer(Modifier.height(15.dp))
                TransparentTextField(
                    textFieldValue = emailValue,
                    textLabel = "Correo electronico",
                    keyboardType = KeyboardType.Email,
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    imeAction = ImeAction.Next
                )
                Spacer(Modifier.height(15.dp))
                TransparentTextField(
                    textFieldValue = addressValue,
                    textLabel = "Direccion",
                    keyboardType = KeyboardType.Text,
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Down)
                        }
                    ),
                    imeAction = ImeAction.Next
                )
            }
        }
    }
}




