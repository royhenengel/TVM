package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.MoviesPopularEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.MovieModel
import com.example.tvm.remote.movie.model.MoviesPopularModel

class EntityMoviesPopularMapper(
    private val entityMovieMapper: EntityMapper<MovieModel, MovieEntity>
) : EntityMapper<MoviesPopularModel, MoviesPopularEntity> {

    override fun fromRemote(type: MoviesPopularModel): MoviesPopularEntity {
        return MoviesPopularEntity(
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { entityMovieMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }

}