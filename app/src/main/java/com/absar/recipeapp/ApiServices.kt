package com.absar.recipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


private val retrofit=Retrofit.Builder().baseUrl("www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())   //converts the JSON response from the API into Kotlin objects automatically
    .build() //starts

    val recipeService = retrofit.create(ApiServices::class.java)  //Retrofit uses this to create an instance of recipeService, which allows you to call API functions like:
                                                                //val response = recipeService.getRecipes()

interface ApiServices{
    @GET("categories.php")
    suspend fun getCategories():categoriesResponse
}