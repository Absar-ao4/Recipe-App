package com.absar.recipeapp

import android.accounts.AuthenticatorDescription
import java.util.Locale.Category

data class category(val idcategory:String,
        val strcategory:String,
        val strCategoryThumb:String,
        val strCategoryDescription: String
    )
data class categoriesResponse(val categories: List<Category>)