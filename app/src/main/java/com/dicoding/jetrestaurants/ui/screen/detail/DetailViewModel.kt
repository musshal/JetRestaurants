package com.dicoding.jetrestaurants.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.jetrestaurants.data.RestaurantRepository
import com.dicoding.jetrestaurants.model.Restaurant
import com.dicoding.jetrestaurants.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(private val restaurantRepository: RestaurantRepository): ViewModel() {

    private val _uiState: MutableStateFlow<UiState<Restaurant>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<Restaurant>> get() = _uiState

    fun getRestaurant(restaurantId: Long) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(restaurantRepository.getRestaurant(restaurantId))
        }
    }
}