package com.juandanielgarcia.myapplication.presentation.details.pet

import com.juandanielgarcia.myapplication.firebase.models.PetModel

data class DetailsPetState(
    val isLoading: Boolean = false,
    val petModel: PetModel?=null,
    val error: String=""
)