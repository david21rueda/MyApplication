package com.juandanielgarcia.myapplication.navigation

import androidx.navigation.NamedNavArgument

sealed class Destinations(
    val route:String,
    val arguments:List<NamedNavArgument>
){

    object Login:Destinations("login", emptyList())
    object AdminHome:Destinations("adminHome", emptyList())
    object PollsterHome:Destinations("pollsterHome", emptyList())
    object UserHome:Destinations("userHome", emptyList())
    object AdminList:Destinations("adminList", emptyList())
    object PollsterList:Destinations("pollsterList", emptyList())
    object UserList:Destinations("UserList", emptyList())
    object PetList:Destinations("PetList", emptyList())
    object Edit:Destinations("Edit", emptyList())
    object Details:Destinations("Details", emptyList())
    object RecoverPassword:Destinations("Recover", emptyList())
}
