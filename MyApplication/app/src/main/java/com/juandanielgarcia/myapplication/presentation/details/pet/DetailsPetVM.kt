package com.juandanielgarcia.myapplication.presentation.details.pet

import android.provider.Settings.Global.getString
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.juandanielgarcia.myapplication.firebase.models.PetModel
import com.juandanielgarcia.myapplication.firebase.repositories.PetRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.*
import javax.inject.Inject

@HiltViewModel
class DetailsPetVM
@Inject
constructor(
    private val petRepository: PetRepository
) : ViewModel() {
    private val _state: MutableState<DetailsPetState> = mutableStateOf(DetailsPetState())
    val state: State<DetailsPetState>
        get() = _state

    fun addNewPet(
        idPet: String,
        namePet: String,
        nameOwner: String,
        cedulaOwner: String,
        typeAnimal: String,
        sex: String,
        breed: String,
        size: String,
        color: String,
        sterilized: String,
        diseases: String,
        age: String,
        wild: String,
        registerDate: String,
        address: String,
        zone: String,
        observation: String
    ) {
        val pet = PetModel(
            idPet=cedulaOwner+UUID.randomUUID().toString(),
            namePet=namePet,
            nameOwner=nameOwner,
            cedulaOwner=cedulaOwner,
            typeAnimal=typeAnimal,
            sex=sex,
            breed=breed,
            size=size,
            color=color,
            sterilized=sterilized,
            diseases=diseases,
            age=age,
            wild=wild,
            registerDate=registerDate,
            address=address,
            zone=zone,
            observation=observation
        )
        petRepository.addNewPet(pet)
    }

}