package com.example.tvm.domain.interactor.movie.model

data class MoviesTopRated(
    val page: Int?,
    val totalPages: Int?,
    val results: List<Results>?,
    val totalResults: Int?
)