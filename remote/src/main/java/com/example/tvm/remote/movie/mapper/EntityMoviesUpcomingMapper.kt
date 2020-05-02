package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.data.movie.model.MoviesUpcomingEntity
import com.example.tvm.data.movie.model.ResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.DatesModel
import com.example.tvm.remote.movie.model.MoviesUpcomingModel
import com.example.tvm.remote.movie.model.ResultsModel
import javax.inject.Inject

class EntityMoviesUpcomingMapper(
    private val entityDatesMapper: EntityMapper<DatesModel, DatesEntity>,
    private val entityResultsMapper: EntityMapper<ResultsModel, ResultsEntity>
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