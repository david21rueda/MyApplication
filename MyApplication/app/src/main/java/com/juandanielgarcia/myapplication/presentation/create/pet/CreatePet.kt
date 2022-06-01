package com.juandanielgarcia.myapplication.presentation.create.pet


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.presentation.create.shared.TopBar
import com.juandanielgarcia.myapplication.presentation.create.shared.TransparentTextField
import com.juandanielgarcia.myapplication.ui.theme.GreenAdd
import com.juandanielgarcia.myapplication.ui.theme.Orange
import com.juandanielgarcia.myapplication.ui.theme.White


@Composable
fun CreatePetScreen(
    navController: NavController
) {

    Scaffold(
        topBar = {
            TopBar(
                title = "Crear Dueño",
                iconButton = R.drawable.back_icon,
                onClickBack = { navController.navigateUp() },
            )
        },
    ) {
        Body(navController)
    }
}

@Composable
fun Body(
    navController: NavController,
) {
    val namePetValue = rememberSaveable { mutableStateOf("") }
    val idPetValue = rememberSaveable { mutableStateOf("") }
    val nameOwnerValue = rememberSaveable { mutableStateOf("") }
    val cedulaOwnerValue = rememberSaveable { mutableStateOf("") }
    val typeAnimalValue = rememberSaveable { mutableStateOf("") }
    val sexValue = rememberSaveable { mutableStateOf("") }
    val breedValue = rememberSaveable { mutableStateOf("") }
    val sizeValue = rememberSaveable { mutableStateOf("") }
    val colorValue = rememberSaveable { mutableStateOf("") }
    val sterilizedValue = rememberSaveable { mutableStateOf("") }
    val diseasesValue = rememberSaveable { mutableStateOf("") }
    val ageValue = rememberSaveable { mutableStateOf("") }
    val wildValue = rememberSaveable { mutableStateOf("") }
    val registerDateValue = rememberSaveable { mutableStateOf("") }
    val addressValue = rememberSaveable { mutableStateOf("") }
    val zoneValue = rememberSaveable { mutableStateOf("") }
    val observationValue = rememberSaveable { mutableStateOf("") }
    val focusManager = LocalFocusManager.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    )
    {
        Column(
            Modifier
                .padding(25.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            TransparentTextField(
                textFieldValue = namePetValue,
                textLabel = "Nombre de la mascota",
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
                textFieldValue = idPetValue,
                textLabel = "Identificacion de la mascota",
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
                textFieldValue = nameOwnerValue,
                textLabel = "Nombres del dueño",
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
                textFieldValue = cedulaOwnerValue,
                textLabel = "Documento del dueño",
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
                textFieldValue = typeAnimalValue,
                textLabel = "Tipo de animal",
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
                textFieldValue = sexValue,
                textLabel = "Sexo",
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
                textFieldValue = breedValue,
                textLabel = "Raza",
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
                textFieldValue = sizeValue,
                textLabel = "Tamaño",
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
                textFieldValue = colorValue,
                textLabel = "Color",
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
                textFieldValue = sterilizedValue,
                textLabel = "¿La mascota está esterilizada?",
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
                textFieldValue = diseasesValue,
                textLabel = "¿Tiene enfermedades?",
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
                textFieldValue = ageValue,
                textLabel = "Fecha de nacimiento",
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
                textFieldValue = wildValue,
                textLabel = "¿Es una animal silvestre?",
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
                textFieldValue = registerDateValue,
                textLabel = "Fecha de registro",
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
                textFieldValue = zoneValue,
                textLabel = "Zona",
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
            Spacer(Modifier.height(15.dp))
            TransparentTextField(
                textFieldValue = observationValue,
                textLabel = "Obveraciones",
                keyboardType = KeyboardType.Text,
                keyboardActions = KeyboardActions(
                    onNext = {
                        focusManager.clearFocus()
                    }
                ),
                imeAction = ImeAction.Done
            )
            Spacer(modifier = Modifier.padding(15.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(width = 150.dp, height = 50.dp),
                shape = RoundedCornerShape(25.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Orange,
                    contentColor = Color.White
                )
            ) {
                Text(text = "Aceptar")
            }
            Spacer(modifier = Modifier.padding(15.dp))

        }

    }

}


