package com.example.tvm.remote.movie.model

import com.google.gson.annotations.SerializedName

data class MoviesNowPlayingModel(

	@SerializedName("dates")
	val dates: DatesModel? = null,

	@SerializedName("page")
	val page: Int? = null,

	@SerializedName("total_pages")
	val totalPages: Int? = null,

	@SerializedName("results")
	val results: List<ResultsModel>? = null,

	@SerializedName("total_results")
	val totalResults: Int? = null
)