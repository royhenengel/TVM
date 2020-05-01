package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.MoviesTopRatedEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.MoviesTopRatedModel
import javax.inject.Inject

class EntityMoviesTopRatedMapper @Inject constructor(
    private val entityResultsMapper: EntityResultsMapper // TODO Inject interface instead of concrete impl
) : EntityMapper<MoviesTopRatedModel, MoviesTopRatedEntity> {

    override fun fromRemote(type: MoviesTopRatedModel): MoviesTopRatedEntity {
        return MoviesTopRatedEntity(
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { entityResultsMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }

}