package com.absar.recipeapp

import android.accounts.AuthenticatorDescription
import android.os.Parcelable
import com.absar.recipeapp.Category
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Category(
        val idCategory:String,
        val strCategory:String,
        val strCategoryThumb:String,
        val strCategoryDescription: String
    ):Parcelable
data class CategoriesResponse(val categories: List<Category>)