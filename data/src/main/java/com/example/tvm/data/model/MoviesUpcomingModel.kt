package com.example.tvm.data.model

data class MoviesUpcomingModel(
	val dates: DatesEntity?,
	val page: Int?,
	val totalPages: Int?,
	val results: List<ResultsModel>?,
	val totalResults: Int?
)