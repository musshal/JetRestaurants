package com.dicoding.jetrestaurants.di

import com.dicoding.jetrestaurants.data.RestaurantRepository

object Injection {
    fun provideRepository(): RestaurantRepository {
        return RestaurantRepository.getInstance()
    }
}