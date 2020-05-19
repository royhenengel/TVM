package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.MoviesTopRatedEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.MovieModel
import com.example.tvm.remote.movie.model.MoviesTopRatedModel

class EntityMoviesTopRatedMapper(
    private val entityMovieMapper: EntityMapper<MovieModel, MovieEntity>
) : EntityMapper<MoviesTopRatedModel, MoviesTopRatedEntity> {

    override fun fromRemote(type: MoviesTopRatedModel): MoviesTopRatedEntity {
        return MoviesTopRatedEntity(
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { entityMovieMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }

}