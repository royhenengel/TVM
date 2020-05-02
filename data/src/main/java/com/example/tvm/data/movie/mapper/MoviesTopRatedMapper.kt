package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.MoviesTopRatedEntity
import com.example.tvm.data.movie.model.ResultsEntity
import com.example.tvm.domain.interactor.movie.model.MoviesTopRated
import com.example.tvm.domain.interactor.movie.model.Results

class MoviesTopRatedMapper(
    private val resultsMapper: Mapper<ResultsEntity, Results>
) : Mapper<MoviesTopRatedEntity, MoviesTopRated> {

    override fun fromEntity(type: MoviesTopRatedEntity): MoviesTopRated {
        return MoviesTopRated(
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesTopRated): MoviesTopRatedEntity {
        return MoviesTopRatedEntity(
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }

}