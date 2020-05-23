package com.example.tvm.domain.interactor.movie.model

data class MoviesResults(
    val dates: Dates?,
    val page: Int?,
    val totalPages: Int?,
    val movies: List<Movie>?,
    val totalResults: Int?
)