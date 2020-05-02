package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.GenreEntity
import com.example.tvm.data.movie.model.MoviesLatestEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.GenreModel
import com.example.tvm.remote.movie.model.MoviesLatestModel

class EntityMoviesLatestMapper(
    private val entityGenreMapper: EntityMapper<GenreModel, GenreEntity>
) : EntityMapper<MoviesLatestModel, MoviesLatestEntity> {

    override fun fromRemote(type: MoviesLatestModel): MoviesLatestEntity {
        return MoviesLatestEntity(
            originalLanguage = type.originalLanguage,
            imdbId = type.imdbId,
            video = type.video,
            title = type.title,
            backdropPath = type.backdropPath,
            revenue = type.revenue,
            genres = type.genres?.map { entityGenreMapper.fromRemote(it) },
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