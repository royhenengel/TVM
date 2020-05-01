package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.MoviesNowPlayingEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.MoviesNowPlayingModel
import javax.inject.Inject

class EntityMoviesNowPlayingMapper @Inject constructor(
    private val entityDatesMapper: EntityDatesMapper, // TODO Inject interface instead of concrete impl
    private val entityResultsMapper: EntityResultsMapper // TODO Inject interface instead of concrete impl
) : EntityMapper<MoviesNowPlayingModel, MoviesNowPlayingEntity> {

    override fun fromRemote(type: MoviesNowPlayingModel): MoviesNowPlayingEntity {
        return MoviesNowPlayingEntity(
            dates = type.dates?.let { entityDatesMapper.fromRemote(it) },
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { entityResultsMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }
}