package com.example.tvm.domain.interactor.movie.model

data class MoviesPopular(
    val page: Int?,
    val totalPages: Int?,
    val movies: List<Movie>?,
    val totalResults: Int?
)