package com.absar.recipeapp

import okhttp3.Route

sealed class Screen(val route: String) {
    object DetailScreen:Screen(route = "detailscreen")
    object RecipeScreen:Screen(route = "recipescreen")

}