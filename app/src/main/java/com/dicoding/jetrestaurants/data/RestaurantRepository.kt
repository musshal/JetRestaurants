package com.dicoding.jetrestaurants.data

import com.dicoding.jetrestaurants.model.FakeRestaurantDataSource
import com.dicoding.jetrestaurants.model.Restaurant
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class RestaurantRepository {

    fun getAllRestaurants(): Flow<List<Restaurant>> {
        return flowOf(FakeRestaurantDataSource.dummyRestaurants)
    }

    fun getRestaurant(restaurantId: Long): Restaurant {
        return FakeRestaurantDataSource.dummyRestaurants.first {
            it.id == restaurantId
        }
    }

    companion object {
        @Volatile
        private var instance: RestaurantRepository? = null

        fun getInstance(): RestaurantRepository =
            instance ?: synchronized(this) {
                RestaurantRepository().apply {
                    instance = this
                }
            }
    }
}