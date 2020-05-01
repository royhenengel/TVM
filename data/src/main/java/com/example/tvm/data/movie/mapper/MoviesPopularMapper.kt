package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.MoviesPopularEntity
import com.example.tvm.domain.interactor.movie.model.MoviesPopular
import javax.inject.Inject

class MoviesPopularMapper @Inject constructor(
    private val resultsMapper: ResultsMapper
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