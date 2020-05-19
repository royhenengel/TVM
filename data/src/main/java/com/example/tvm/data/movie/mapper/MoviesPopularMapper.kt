package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.MoviesPopularEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.domain.interactor.movie.model.MoviesPopular
import com.example.tvm.domain.interactor.movie.model.Movie

class MoviesPopularMapper(
    private val movieMapper: Mapper<MovieEntity, Movie>
) : Mapper<MoviesPopularEntity, MoviesPopular> {

    override fun fromEntity(type: MoviesPopularEntity): MoviesPopular {
        return MoviesPopular(
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesPopular): MoviesPopularEntity {
        return MoviesPopularEntity(
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }

}