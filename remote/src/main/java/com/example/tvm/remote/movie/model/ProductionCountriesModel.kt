package com.example.tvm.remote.movie.model

import com.google.gson.annotations.SerializedName

data class ProductionCountriesModel(

	@field:SerializedName("iso_3166_1")
	val iso31661: String? = null,

	@field:SerializedName("name")
	val name: String? = null
)