package com.dicoding.jetrestaurants.model

data class Restaurant(
    val id: Long,
    val name: String,
    val description: String,
    val picture: Int,
    val city: String,
    val rating: Double,
    val address: String
)
