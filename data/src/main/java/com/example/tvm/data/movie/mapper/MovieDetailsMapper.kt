package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.*
import com.example.tvm.domain.interactor.movie.model.*

class MovieDetailsMapper(
    private val genreMapper: Mapper<GenreEntity, Genre>,
    private val productionCountriesMapper: Mapper<ProductionCountriesEntity, ProductionCountries>,
    private val productionCompanyMapper: Mapper<ProductionCompanyEntity, ProductionCompany>,
    private val spokenLanguageMapper: Mapper<SpokenLanguagesEntity, SpokenLanguages>
) : Mapper<MovieDetailsEntity, MovieDetails> {

    override fun fromEntity(type: MovieDetailsEntity): MovieDetails {
        return MovieDetails(
            originalLanguage = type.originalLanguage,
            imdbId = type.imdbId,
            video = type.video,
            title = type.originalTitle,
            backdropPath = type.backdropPath,
            revenue = type.revenue,
            genres = type.genres?.map { genreMapper.fromEntity(it) },
            popularity = type.popularity,
            productionCountries = type.productionCountries?.map { productionCountriesMapper.fromEntity(it) },
            id = type.id,
            voteCount = type.voteCount,
            budget = type.budget,
            overview = type.overview,
            originalTitle = type.originalTitle,
            runtime = type.runtime,
            posterPath = type.posterPath,
            spokenLanguages = type.spokenLanguages?.map { spokenLanguageMapper.fromEntity(it) },
            productionCompanies = type.productionCompanies?.map { productionCompanyMapper.fromEntity(it) },
            releaseDate = type.releaseDate,
            voteAverage = type.voteAverage,
            belongsToCollection = type.belongsToCollection,
            tagline = type.tagline,
            adult = type.adult,
            homepage = type.homepage,
            status = type.status
        )
    }

    override fun toEntity(type: MovieDetails): MovieDetailsEntity {
        return MovieDetailsEntity(
            originalLanguage = type.originalLanguage,
            imdbId = type.imdbId,
            video = type.video,
            title = type.originalTitle,
            backdropPath = type.backdropPath,
            revenue = type.revenue,
            genres = type.genres?.map { genreMapper.toEntity(it) },
            popularity = type.popularity,
            productionCountries = type.productionCountries?.map { productionCountriesMapper.toEntity(it) },
            id = type.id,
            voteCount = type.voteCount,
            budget = type.budget,
            overview = type.overview,
            originalTitle = type.originalTitle,
            runtime = type.runtime,
            posterPath = type.posterPath,
            spokenLanguages = type.spokenLanguages?.map { spokenLanguageMapper.toEntity(it) },
            productionCompanies = type.productionCompanies?.map { productionCompanyMapper.toEntity(it) },
            releaseDate = type.releaseDate,
            voteAverage = type.voteAverage,
            belongsToCollection = type.belongsToCollection,
            tagline = type.tagline,
            adult = type.adult,
            homepage = type.homepage,
            status = type.status
        )
    }

}