package com.example.tvm.domain.interactor.movie.model

data class MoviesNowPlaying(
    val dates: Dates?,
    val page: Int?,
    val totalPages: Int?,
    val results: List<Results>?,
    val totalResults: Int?
)