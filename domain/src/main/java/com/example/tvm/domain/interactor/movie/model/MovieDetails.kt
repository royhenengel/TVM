package com.example.tvm.domain.interactor.movie.model

data class MovieDetails(
    val originalLanguage: String?,
    val imdbId: String?,
    val video: Boolean?,
    val title: String?,
    val backdropPath: String?,
    val revenue: Int?,
    val genres: List<Genre>?,
    val popularity: Double?,
    val productionCountries: List<ProductionCountries>?,
    val id: Int?,
    val voteCount: Int?,
    val budget: Int?,
    val overview: String?,
    val originalTitle: String?,
    val runtime: Int?,
    val posterPath: String?,
    val spokenLanguages: List<SpokenLanguages>?,
    val productionCompanies: List<ProductionCompany>?,
    val releaseDate: String?,
    val voteAverage: Int?,
    val belongsToCollection: Any?,
    val tagline: String?,
    val adult: Boolean?,
    val homepage: String?,
    val status: String?
)