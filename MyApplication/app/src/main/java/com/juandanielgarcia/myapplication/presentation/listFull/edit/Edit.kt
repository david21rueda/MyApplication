package com.juandanielgarcia.myapplication.presentation.listFull.edit

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun UiEditScreen(
    navController: NavController,
) {

    Scaffold(
        topBar = {
            TopBar()
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }, Modifier.size(80.dp)) {
                Icon(imageVector = Icons.Default.Check, contentDescription = null)
            }
        }
    ) {
        Body()
    }
}

@Composable
fun Body() {
    val nameValue = rememberSaveable { mutableStateOf("") }
    val lastNameValue = rememberSaveable { mutableStateOf("") }
    val idValue = rememberSaveable { mutableStateOf("") }
    val phoneValue = rememberSaveable { mutableStateOf("") }
    val emailValue = rememberSaveable { mutableStateOf("") }
    val addressValue = rememberSaveable { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    Surface(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Column(Modifier.fillMaxWidth()) {
            LongTextFileds(
                textFieldValue = nameValue,
                placeHolder = "Nombres",
                keyboardType = KeyboardType.Text,
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.moveFocus(FocusDirection.Down)
                    }
                ),
                imeAction = ImeAction.Next
            )

            LongTextFileds(
                textFieldValue = lastNameValue,
                placeHolder = "Apellidos",
                keyboardType = KeyboardType.Text,
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.moveFocus(FocusDirection.Down)
                    }
                ),
                imeAction = ImeAction.Next
            )

            LongTextFileds(
                textFieldValue = idValue,
                placeHolder = "Cedula",
                keyboardType = KeyboardType.Number,
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.moveFocus(FocusDirection.Down)
                    }
                ),
                imeAction = ImeAction.Next
            )

            LongTextFileds(
                textFieldValue = phoneValue,
                placeHolder = "Telefono",
                keyboardType = KeyboardType.Phone,
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.moveFocus(FocusDirection.Down)
                    }
                ),
                imeAction = ImeAction.Next
            )
            LongTextFileds(
                textFieldValue = emailValue,
                placeHolder = "Email",
                keyboardType = KeyboardType.Email,
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.moveFocus(FocusDirection.Down)
                    }
                ),
                imeAction = ImeAction.Next
            )

            LongTextFileds(
                textFieldValue = addressValue,
                placeHolder = "Dirección",
                keyboardType = KeyboardType.Text,
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.clearFocus()
                        //TODO
                    }
                ),
                imeAction = ImeAction.Done
            )
        }
    }
}

@Composable
fun LongTextFileds(
    textFieldValue: MutableState<String>,
    placeHolder: String,
    keyboardType: KeyboardType,
    keyboardActions: KeyboardActions,
    imeAction: ImeAction,

    ) {
    OutlinedTextField(
        value = textFieldValue.value,
        onValueChange = { textFieldValue.value = it },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { Text(placeHolder) },
        maxLines = 1,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = imeAction,
        ),
        keyboardActions = keyboardActions,
    )
    Spacer(modifier = Modifier.padding(8.dp))
}

@Composable
fun TopBar() {
    TopAppBar(
        title = {
            Text(text = "Llene los datos del dueño", maxLines = 2)
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "SingIn"
                )
            }
        }
    )
}



