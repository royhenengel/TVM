package com.example.tvm.data.movie.model

data class MovieDetailsEntity(
    val originalLanguage: String?,
    val imdbId: String?,
    val video: Boolean?,
    val title: String?,
    val backdropPath: String?,
    val revenue: Int?,
    val genres: List<GenreEntity>?,
    val popularity: Double?,
    val productionCountries: List<ProductionCountriesEntity>?,
    val id: Int?,
    val voteCount: Int?,
    val budget: Int?,
    val overview: String?,
    val originalTitle: String?,
    val runtime: Int?,
    val posterPath: String?,
    val spokenLanguages: List<SpokenLanguagesEntity>?,
    val productionCompanies: List<ProductionCompanyEntity>?,
    val releaseDate: String?,
    val voteAverage: Int?,
    val belongsToCollection: Any?,
    val tagline: String?,
    val adult: Boolean?,
    val homepage: String?,
    val status: String?
)