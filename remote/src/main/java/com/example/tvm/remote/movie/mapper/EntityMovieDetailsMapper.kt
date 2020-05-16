package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.*
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.*

class EntityMovieDetailsMapper(
    private val genreMapper: EntityMapper<GenreModel, GenreEntity>,
    private val productionCountriesMapper: EntityMapper<ProductionCountriesModel, ProductionCountriesEntity>,
    private val productionCompanyMapper: EntityMapper<ProductionCompanyModel, ProductionCompanyEntity>,
    private val spokenLanguageMapper: EntityMapper<SpokenLanguagesModel, SpokenLanguagesEntity>
) : EntityMapper<MovieDetailsModel, MovieDetailsEntity> {

    override fun fromRemote(type: MovieDetailsModel): MovieDetailsEntity {
        return MovieDetailsEntity(
            originalLanguage = type.originalLanguage,
            imdbId = type.imdbId,
            video = type.video,
            title = type.originalTitle,
            backdropPath = type.backdropPath,
            revenue = type.revenue,
            genres = type.genres?.map { genreMapper.fromRemote(it) },
            popularity = type.popularity,
            productionCountries = type.productionCountries?.map { productionCountriesMapper.fromRemote(it) },
            id = type.id,
            voteCount = type.voteCount,
            budget = type.budget,
            overview = type.overview,
            originalTitle = type.originalTitle,
            runtime = type.runtime,
            posterPath = type.posterPath,
            spokenLanguages = type.spokenLanguages?.map { spokenLanguageMapper.fromRemote(it) },
            productionCompanies = type.productionCompanies?.map { productionCompanyMapper.fromRemote(it) },
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