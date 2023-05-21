package com.example.weather.screen

sealed class Screen(val route: String){
    object Home: Screen("Home")
}