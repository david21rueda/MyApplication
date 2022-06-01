package com.juandanielgarcia.myapplication.navigation

import androidx.navigation.NamedNavArgument

sealed class Destinations(
    val route:String,
    val arguments:List<NamedNavArgument>
){

    object Login:Destinations("login", emptyList())
    object RecoverPassword:Destinations("RecoverPassword", emptyList())
    object SuccessRecover:Destinations("SuccessRecover", emptyList())

    object AdminHome:Destinations("Home/Admin", emptyList())
    object PollsterHome:Destinations("Home/Pollster", emptyList())
    object UserHome:Destinations("Home/User", emptyList())

    object AdminList:Destinations("List/Admin", emptyList())
    object PollsterList:Destinations("List/Pollster", emptyList())
    object UserList:Destinations("List/User", emptyList())
    object PetList:Destinations("List/Pet", emptyList())

    object CreateAdmin:Destinations("Create/Admin", emptyList())
    object CreatePollster:Destinations("Create/Pollster", emptyList())
    object CreateUser:Destinations("Create/User", emptyList())
    object CreatePet:Destinations("Create/Pet", emptyList())

    object Edit:Destinations("Edit", emptyList())

    object DetailsAdmin:Destinations("Details/Admin", emptyList())
    object DetailsPollster:Destinations("Details/Pollster", emptyList())
    object DetailsPet:Destinations("Details/Pet", emptyList())
    object DetailsUser:Destinations("Details/User", emptyList())


}
