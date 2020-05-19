package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.MoviesTopRatedEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.domain.interactor.movie.model.MoviesTopRated
import com.example.tvm.domain.interactor.movie.model.Movie

class MoviesTopRatedMapper(
    private val movieMapper: Mapper<MovieEntity, Movie>
) : Mapper<MoviesTopRatedEntity, MoviesTopRated> {

    override fun fromEntity(type: MoviesTopRatedEntity): MoviesTopRated {
        return MoviesTopRated(
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesTopRated): MoviesTopRatedEntity {
        return MoviesTopRatedEntity(
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }

}