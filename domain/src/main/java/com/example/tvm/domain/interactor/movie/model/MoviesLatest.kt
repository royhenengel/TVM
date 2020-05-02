package com.example.tvm.domain.interactor.movie.model

import com.example.tvm.domain.interactor.movie.model.Genre

data class MoviesLatest(
    val originalLanguage: String?,
    val imdbId: String?,
    val video: Boolean?,
    val title: String?,
    val backdropPath: String?,
    val revenue: Int?,
    val genres: List<Genre>?,
    val popularity: Int?,
    val productionCountries: List<Any>?,
    val id: Int?,
    val voteCount: Int?,
    val budget: Int?,
    val overview: String?,
    val originalTitle: String?,
    val runtime: Int?,
    val posterPath: Any?,
    val spokenLanguages: List<Any>?,
    val productionCompanies: List<Any>?,
    val releaseDate: String?,
    val voteAverage: Int?,
    val belongsToCollection: Any?,
    val tagline: String?,
    val adult: Boolean?,
    val homepage: String?,
    val status: String?
)