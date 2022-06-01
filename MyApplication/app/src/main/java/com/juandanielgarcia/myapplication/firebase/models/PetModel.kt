package com.juandanielgarcia.myapplication.firebase.models

data class PetModel(
    val idPet: String,
    val namePet: String,
    val nameOwner: String,
    val cedulaOwner: String,
    val typeAnimal: String,
    val sex: String,
    val breed: String,
    val size: String,
    val color: String,
    val sterilized: String,
    val diseases: String,
    val age: String,
    val wild: String,
    val registerDate: String,
    val address: String,
    val zone: String,
    val observation: String,
) {
    constructor() : this(
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
    )
}
