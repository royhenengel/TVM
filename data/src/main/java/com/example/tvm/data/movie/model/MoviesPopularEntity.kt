package com.example.tvm.data.movie.model

data class MoviesPopularEntity(
    val page: Int?,
    val totalPages: Int?,
    val movies: List<MovieEntity>?,
    val totalResults: Int?
)