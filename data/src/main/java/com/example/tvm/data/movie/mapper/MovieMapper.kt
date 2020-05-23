package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.domain.interactor.movie.model.Movie

class MovieMapper : Mapper<MovieEntity, Movie> {

    override fun fromEntity(type: MovieEntity): Movie {
        return Movie(
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

    override fun toEntity(type: Movie): MovieEntity {
        return MovieEntity(
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