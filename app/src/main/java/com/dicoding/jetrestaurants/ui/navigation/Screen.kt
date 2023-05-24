package com.dicoding.jetrestaurants.ui.navigation

sealed class Screen(val route: String) {
    object Home: Screen("home")
    object Detail: Screen("home/{restaurantId}") {
        fun createRoute(restaurantId: Long) = "home/$restaurantId"
    }
    object About: Screen("about")
}
