package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.MoviesUpcomingEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.MoviesUpcomingModel
import javax.inject.Inject

class EntityMoviesUpcomingMapper @Inject constructor(
    private val entityDatesMapper: EntityDatesMapper,
    private val entityResultsMapper: EntityResultsMapper
) : EntityMapper<MoviesUpcomingModel, MoviesUpcomingEntity> {

    override fun fromRemote(type: MoviesUpcomingModel): MoviesUpcomingEntity {
        return MoviesUpcomingEntity(
            dates = type.dates?.let { entityDatesMapper.fromRemote(it) },
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { entityResultsMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }
}