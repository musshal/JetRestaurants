package com.dicoding.jetrestaurants.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.jetrestaurants.data.RestaurantRepository
import com.dicoding.jetrestaurants.model.Restaurant
import com.dicoding.jetrestaurants.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(private val restaurantRepository: RestaurantRepository): ViewModel() {

    private val _uiState: MutableStateFlow<UiState<List<Restaurant>>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<Restaurant>>> get() = _uiState

    fun getAllRestaurants() {
        viewModelScope.launch {
            restaurantRepository.getAllRestaurants()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { restaurants ->
                    _uiState.value = UiState.Success(restaurants)
                }
        }
    }
}