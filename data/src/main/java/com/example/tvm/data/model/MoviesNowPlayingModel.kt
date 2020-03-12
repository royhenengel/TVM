package com.example.tvm.data.model

data class MoviesNowPlayingModel(
	val dates: DatesEntity?,
	val page: Int?,
	val totalPages: Int?,
	val results: List<ResultsModel?>?,
	val totalResults: Int?
)