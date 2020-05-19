package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.data.movie.model.MoviesNowPlayingEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.DatesModel
import com.example.tvm.remote.movie.model.MoviesNowPlayingModel
import com.example.tvm.remote.movie.model.ResultsModel

class EntityMoviesNowPlayingMapper(
    private val entityDatesMapper: EntityMapper<DatesModel, DatesEntity>,
    private val entityResultsMapper: EntityMapper<ResultsModel, ResultsEntity>
) : EntityMapper<MoviesNowPlayingModel, MoviesNowPlayingEntity> {

    override fun fromRemote(type: MoviesNowPlayingModel): MoviesNowPlayingEntity {
        return MoviesNowPlayingEntity(
            dates = type.dates?.let { entityDatesMapper.fromRemote(it) },
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { entityMovieMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }

}