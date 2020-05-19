package com.example.tvm.remote.movie.model

import com.google.gson.annotations.SerializedName

data class SpokenLanguagesModel(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("iso_639_1")
	val iso6391: String? = null
)