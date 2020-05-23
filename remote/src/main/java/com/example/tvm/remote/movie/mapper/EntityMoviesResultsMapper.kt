package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.data.movie.model.MoviesResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.DatesModel
import com.example.tvm.remote.movie.model.MovieModel
import com.example.tvm.remote.movie.model.MoviesResultsModel

class EntityMoviesResultsMapper(
    private val entityDatesMapper: EntityMapper<DatesModel, DatesEntity>,
    private val entityMovieMapper: EntityMapper<MovieModel, MovieEntity>
) : EntityMapper<MoviesResultsModel, MoviesResultsEntity> {

    override fun fromRemote(type: MoviesResultsModel): MoviesResultsEntity {
        return MoviesResultsEntity(
            dates = type.dates?.let { entityDatesMapper.fromRemote(it) },
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { entityMovieMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }
}