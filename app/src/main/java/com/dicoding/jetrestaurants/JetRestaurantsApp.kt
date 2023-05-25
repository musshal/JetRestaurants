package com.dicoding.jetrestaurants

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dicoding.jetrestaurants.ui.navigation.NavigationItem
import com.dicoding.jetrestaurants.ui.navigation.Screen
import com.dicoding.jetrestaurants.ui.screen.about.AboutScreen
import com.dicoding.jetrestaurants.ui.screen.detail.DetailScreen
import com.dicoding.jetrestaurants.ui.screen.home.HomeScreen
import com.dicoding.jetrestaurants.ui.theme.JetRestaurantsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JetRestaurantsApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold(
        modifier = modifier,
        bottomBar = {
            BottomBar(navController)
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    navigateToDetail = { restaurantId ->
                        navController.navigate(Screen.Detail.createRoute(restaurantId))
                    }
                )
            }
            composable(Screen.About.route) {
                AboutScreen()
            }
            composable(
                route = Screen.Detail.route,
                arguments = listOf(
                    navArgument("restaurantId") {
                        type = NavType.LongType
                    }
                )
            ) {
                val restaurantId = it.arguments?.getLong("restaurantId") ?: -1L

                DetailScreen(
                    restaurantId = restaurantId,
                    navigateBack = {
                        navController.navigateUp()
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun JetRestaurantsAppPreview() {
    JetRestaurantsTheme {
        JetRestaurantsApp()
    }
}

@Composable
fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    BottomAppBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(R.string.menu_about),
                icon = Icons.Default.AccountCircle,
                screen = Screen.About
            )
        )
        BottomAppBar {
            navigationItems.map { item ->
                NavigationBarItem(
                    selected = currentRoute == item.screen.route,
                    onClick = {
                        navController.navigate(item.screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            restoreState = true
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription =
                            if (item.title == stringResource(R.string.menu_about)) "about_page"
                            else "home_page"
                        )
                    },
                    label = { Text(item.title) },
                )
            }
        }
    }
}