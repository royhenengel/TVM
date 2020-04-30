package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.model.MoviesPopularEntity
import com.example.tvm.data.model.ResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.MoviesPopularModel
import com.example.tvm.remote.movie.model.ResultsModel
import javax.inject.Inject

class MoviesPopularMapper @Inject constructor(
    private val resultsMapper: ResultsMapper
) : EntityMapper<MoviesPopularModel, MoviesPopularEntity> {

    override fun fromRemote(type: MoviesPopularModel): MoviesPopularEntity {
        return MoviesPopularEntity(
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }

}