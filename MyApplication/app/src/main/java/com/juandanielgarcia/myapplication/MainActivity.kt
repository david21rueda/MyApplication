package com.juandanielgarcia.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.juandanielgarcia.myapplication.navigation.Navigation
import com.juandanielgarcia.myapplication.navigation.NavigationAnimated
import com.juandanielgarcia.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Navigation()
            }
        }
    }
}

