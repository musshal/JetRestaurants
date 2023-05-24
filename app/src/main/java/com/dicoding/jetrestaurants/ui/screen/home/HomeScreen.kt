package com.dicoding.jetrestaurants.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.dicoding.jetrestaurants.di.Injection
import com.dicoding.jetrestaurants.helper.ViewModelFactory
import com.dicoding.jetrestaurants.model.Restaurant
import com.dicoding.jetrestaurants.ui.common.UiState
import com.dicoding.jetrestaurants.ui.components.RestaurantItem

@Composable
fun HomeScreen(
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (Long) -> Unit
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                viewModel.getAllRestaurants()
            }
            is UiState.Success -> {
                HomeContent(
                    restaurants = uiState.data,
                    navigateToDetail = navigateToDetail
                )
            }
            is UiState.Error -> {}
        }
    }
}

@Composable
fun HomeContent(
    restaurants: List<Restaurant>,
    navigateToDetail: (Long) -> Unit
) {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(restaurants) { restaurant ->
            RestaurantItem(
                name = restaurant.name,
                description = restaurant.description,
                picture = restaurant.picture,
                modifier = Modifier.clickable {
                    navigateToDetail(restaurant.id)
                }
            )
        }
    }
}