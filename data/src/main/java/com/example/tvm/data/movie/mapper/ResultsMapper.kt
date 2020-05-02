package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.ResultsEntity
import com.example.tvm.domain.interactor.movie.model.Results

class ResultsMapper : Mapper<ResultsEntity, Results> {

    override fun fromEntity(type: ResultsEntity): Results {
        return Results(
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

    override fun toEntity(type: Results): ResultsEntity {
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