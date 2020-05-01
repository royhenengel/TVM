package com.example.tvm.data.movie.model

data class MoviesUpcomingEntity(
    val dates: DatesEntity?,
    val page: Int?,
    val totalPages: Int?,
    val results: List<ResultsEntity>?,
    val totalResults: Int?
)