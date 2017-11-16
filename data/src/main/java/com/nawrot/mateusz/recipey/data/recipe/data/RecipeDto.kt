package com.nawrot.mateusz.recipey.data.recipe.data

import com.squareup.moshi.Json


data class RecipeDto(@Json(name = "objectId") val id: String,
                     val name: String,
                     val ingredients: String)