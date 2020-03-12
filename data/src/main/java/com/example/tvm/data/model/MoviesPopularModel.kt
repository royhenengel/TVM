package com.example.tvm.data.model

data class MoviesPopularModel(
	val page: Int?,
	val totalPages: Int?,
	val results: List<ResultsModel?>?,
	val totalResults: Int?
)