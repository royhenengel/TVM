package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.ResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.ResultsModel

class EntityResultsMapper : EntityMapper<ResultsModel, ResultsEntity> {

    override fun fromRemote(type: ResultsModel): ResultsEntity {
        return ResultsEntity(
            overview = type.overview,
            originalLanguage = type.originalLanguage,
            originalTitle = type.originalTitle,
            video = type.video,
            title = type.title,
            genreIds = type.genreIds,
            posterPath = type.posterPath,
            backdropPath = type.backdropPath,
            releaseDate = type.releaseDate,
            popularity = type.popularity,
            voteAverage = type.voteAverage,
            id = type.id,
            adult = type.adult,
            voteCount = type.voteCount
        )
    }
}