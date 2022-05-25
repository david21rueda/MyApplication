package com.juandanielgarcia.myapplication.presentation.home.adminHome

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AdminHomeViewModel : ViewModel() {
    val state: MutableState<AdminHomeState> = mutableStateOf(AdminHomeState())
    fun goTo(typeList: String) {

        viewModelScope.launch {
            state.value = state.value.copy(typeList = typeList)
            state.value = state.value.copy(successGoTo = true)
        }

    }
}