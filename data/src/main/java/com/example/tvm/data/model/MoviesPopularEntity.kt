package com.example.tvm.data.model

data class MoviesPopularEntity(
	val page: Int?,
	val totalPages: Int?,
	val results: List<ResultsEntity?>?,
	val totalResults: Int?
)