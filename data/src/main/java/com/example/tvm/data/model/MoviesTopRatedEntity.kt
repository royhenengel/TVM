package com.example.tvm.data.model

data class MoviesTopRatedEntity(
	val page: Int?,
	val totalPages: Int?,
	val results: List<ResultsEntity>?,
	val totalResults: Int?
)