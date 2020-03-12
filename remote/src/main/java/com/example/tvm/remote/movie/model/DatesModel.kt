package com.example.tvm.remote.movie.model

import com.google.gson.annotations.SerializedName

data class DatesModel(

	@SerializedName("maximum")
	val maximum: String? = null,

	@SerializedName("minimum")
	val minimum: String? = null
)