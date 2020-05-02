package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.GenreEntity
import com.example.tvm.data.movie.model.MoviesLatestEntity
import com.example.tvm.domain.interactor.movie.model.Genre
import com.example.tvm.domain.interactor.movie.model.MoviesLatest

class MoviesLatestMapper(
    private val genreMapper: Mapper<GenreEntity, Genre>
) : Mapper<MoviesLatestEntity, MoviesLatest> {

    override fun fromEntity(type: MoviesLatestEntity): MoviesLatest {
        return MoviesLatest(
            originalLanguage = type.originalLanguage,
            imdbId = type.imdbId,
            video = type.video,
            title = type.title,
            backdropPath = type.backdropPath,
            revenue = type.revenue,
            genres = type.genres?.map { genreMapper.fromEntity(it) },
            popularity = type.popularity,
            productionCountries = type.productionCountries,
            id = type.id,
            voteCount = type.voteCount,
            budget = type.budget,
            overview = type.overview,
            originalTitle = type.originalTitle,
            runtime = type.runtime,
            posterPath = type.posterPath,
            spokenLanguages = type.spokenLanguages,
            productionCompanies = type.productionCompanies,
            releaseDate = type.releaseDate,
            voteAverage = type.voteAverage,
            belongsToCollection = type.belongsToCollection,
            tagline = type.tagline,
            adult = type.adult,
            homepage = type.homepage,
            status = type.status
        )
    }

    override fun toEntity(type: MoviesLatest): MoviesLatestEntity {
        return MoviesLatestEntity(
            originalLanguage = type.originalLanguage,
            imdbId = type.imdbId,
            video = type.video,
            title = type.title,
            backdropPath = type.backdropPath,
            revenue = type.revenue,
            genres = type.genres?.map { genreMapper.toEntity(it) },
            popularity = type.popularity,
            productionCountries = type.productionCountries,
            id = type.id,
            voteCount = type.voteCount,
            budget = type.budget,
            overview = type.overview,
            originalTitle = type.originalTitle,
            runtime = type.runtime,
            posterPath = type.posterPath,
            spokenLanguages = type.spokenLanguages,
            productionCompanies = type.productionCompanies,
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