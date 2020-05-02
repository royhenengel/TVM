package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.MoviesPopularEntity
import com.example.tvm.data.movie.model.ResultsEntity
import com.example.tvm.domain.interactor.movie.model.MoviesPopular
import com.example.tvm.domain.interactor.movie.model.Results

class MoviesPopularMapper(
    private val resultsMapper: Mapper<ResultsEntity, Results>
) : Mapper<MoviesPopularEntity, MoviesPopular> {

    override fun fromEntity(type: MoviesPopularEntity): MoviesPopular {
        return MoviesPopular(
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesPopular): MoviesPopularEntity {
        return MoviesPopularEntity(
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }

}