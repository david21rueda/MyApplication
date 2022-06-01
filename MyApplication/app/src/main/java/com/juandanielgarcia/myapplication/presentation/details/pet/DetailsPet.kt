package com.juandanielgarcia.myapplication.presentation.details.pet

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.relocationRequester
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import androidx.navigation.compose.rememberNavController
import com.juandanielgarcia.myapplication.presentation.details.shared.*
import com.juandanielgarcia.myapplication.R
import com.juandanielgarcia.myapplication.ui.theme.*

@Composable
fun DetailsPet(
    navController: NavController,
    IDPet: String = "1193356776-1",
    NamePet: String = "Pachoncito",
    TypeAnimal: String = "Perro",
    Breed: String = "Bulldog",
    Sex: String = "Macho",
    NameOwner: String = "Juan Daniel Garcia",
    Size: String = "Mediano",
    CedulaOwner: String = "1193356776",
    Color: String = "Marron",
    Sterilized: String = "Si",
    Diseases: String = "Ninguna",
    Age: String = "21-05-2020",
    Wild: String = "No",
    RegisterDate: String = "21-05-22",
    Address: String = "Calle 1 Barrio Colombia",
    Zone: String = "Casco Urbano",
    Observations: String = "Ninguna",
) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Mascota en Detalle",
                iconButton = R.drawable.back_icon,
                onClickBack = {
                    navController.navigateUp()
                },
                backGroundTint = GreenAdd,
                contentTint = White,
            )

        },

        ) { innerPadding ->
        DetailPetCard(
            modifier = Modifier.padding(innerPadding),
            NamePet = "Pachoncito",
            TypeAnimal = "Perro",
            Breed = "Bulldog",
            Sex = "Macho",
            NameOwner = "Juan Daniel Garcia Peña",
            CedulaOwner = "1193356776",
            Color = "Marron",
            IDPet = "1193356776-1",
            Sterilized = "Si",
            Age = "5 años",
            Wild = "No",
            RegisterDate = "21-05-22",
            Address = "Calle 1 Barrio Colombia",
            Zone = "Casco Urbano",
            Observations = "Ninguna",
            Size = "Mediano",
            Diseases = "Ninguna"
        )
    }
}

@Composable
fun DetailPetCard(
    modifier: Modifier = Modifier,
    IDPet: String,
    NamePet: String,
    TypeAnimal: String,
    Breed: String,
    Sex: String,
    NameOwner: String,
    Size: String,
    CedulaOwner: String,
    Color: String,
    Sterilized: String,
    Diseases: String,
    Age: String,
    Wild: String,
    RegisterDate: String,
    Address: String,
    Zone: String,
    Observations: String,

    ) {
    Surface(modifier = Modifier.fillMaxSize()) {

        val stateScroll = rememberScrollState()
        Column(modifier = Modifier.verticalScroll(stateScroll)) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(300.dp),
                shape = RoundedCornerShape(
                    bottomStart = 80.dp,
                    bottomEnd = 80.dp
                ),
                backgroundColor = GreenAdd,
                elevation = 3.dp
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painterResource(R.drawable.perro),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(250.dp)
                            .clip(shape = RoundedCornerShape(25.dp)),
                    )
                    Box(
                        modifier = Modifier
                            .padding(top = 170.dp)
                            .size(250.dp, 80.dp)
                            .clip(
                                shape = RoundedCornerShape(
                                    bottomEnd = 25.dp,
                                    bottomStart = 25.dp
                                )
                            )
                            .background(BlackTransparent),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Column(
                            modifier = Modifier.padding(15.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = NamePet,
                                style = MaterialTheme.typography.h6.copy(
                                    fontWeight = FontWeight.Bold,
                                ),
                                color = White,
                                textAlign = TextAlign.Center,
                            )
                            Text(
                                text = "$TypeAnimal - $Breed",
                                style = MaterialTheme.typography.h6.copy(
                                    fontWeight = FontWeight.Light,
                                ),
                                color = White,
                                textAlign = TextAlign.Center,
                            )
                        }


                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(25.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Dueño",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )

                        Text(
                            text = NameOwner,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "CC dueño",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )
                        Text(
                            text = CedulaOwner,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Sexo",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )

                        Text(
                            text = Sex,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "ID Mascota",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )
                        Text(
                            text = IDPet,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Color",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )

                        Text(
                            text = Color,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Tamaño",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )
                        Text(
                            text = Size,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Edad",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )

                        Text(
                            text = Age,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Enfermedades",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )
                        Text(
                            text = Diseases,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Animal Silvestre",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )

                        Text(
                            text = Wild,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Esterilizado",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )
                        Text(
                            text = Sterilized,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Fecha de Registro",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )

                        Text(
                            text = RegisterDate,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Observaciones",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )
                        Text(
                            text = Observations,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Column(modifier = Modifier.weight(1f)) {
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
                    }
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Zona",
                            style = MaterialTheme.typography.h6.copy(
                                fontWeight = FontWeight.Bold,
                            ),
                            color = BlueLight,
                        )
                        Text(
                            text = Zone,
                            style = MaterialTheme.typography.body1.copy(
                                fontWeight = FontWeight.Medium,
                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun TopBar(
    title: String,
    iconButton: Int,
    onClickBack: () -> Unit = {},
    onEdit: () -> Unit = {},
    onDelete: () -> Unit = {},
    backGroundTint: Color = Color.White,
    contentTint: Color = Color.Black,
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
                Icon(Icons.Default.Edit, contentDescription = null)
            }
            IconButton(onClick = onDelete) {
                Icon(Icons.Default.Delete, contentDescription = null)
            }
        },
        backgroundColor = backGroundTint,
        contentColor = contentTint,
    )
}
