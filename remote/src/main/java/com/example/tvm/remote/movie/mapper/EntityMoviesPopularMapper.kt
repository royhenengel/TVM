package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.movie.model.MoviesPopularEntity
import com.example.tvm.data.movie.model.ResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.MovieModel
import com.example.tvm.remote.movie.model.MoviesPopularModel

class EntityMoviesPopularMapper(
    private val entityResultsMapper: EntityMapper<ResultsModel, ResultsEntity>
) : EntityMapper<MoviesPopularModel, MoviesPopularEntity> {

    override fun fromRemote(type: MoviesPopularModel): MoviesPopularEntity {
        return MoviesPopularEntity(
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { entityResultsMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }

}