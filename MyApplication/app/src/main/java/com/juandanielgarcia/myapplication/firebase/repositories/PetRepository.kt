package com.juandanielgarcia.myapplication.firebase.repositories

import com.google.firebase.firestore.CollectionReference
import com.juandanielgarcia.myapplication.firebase.models.PetModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PetRepository
@Inject
constructor(
    private val petList: CollectionReference
) {
    fun addNewPet(pet: PetModel) {
        try {
            petList.document(pet.idPet)
        }catch (e:Exception){
            e.printStackTrace()
        }

    }
}