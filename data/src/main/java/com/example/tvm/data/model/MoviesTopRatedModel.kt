package com.example.tvm.data.model

data class MoviesTopRatedModel(
	val page: Int?,
	val totalPages: Int?,
	val results: List<ResultsModel>?,
	val totalResults: Int?
)