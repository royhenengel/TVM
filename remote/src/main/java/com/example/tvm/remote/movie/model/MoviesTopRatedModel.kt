package com.example.tvm.remote.movie.model

import com.google.gson.annotations.SerializedName

data class MoviesTopRatedModel(

	@SerializedName("page")
	val page: Int? = null,

	@SerializedName("total_pages")
	val totalPages: Int? = null,

	@SerializedName("results")
	val movies: List<MovieModel>? = null,

	@SerializedName("total_results")
	val totalResults: Int? = null
)