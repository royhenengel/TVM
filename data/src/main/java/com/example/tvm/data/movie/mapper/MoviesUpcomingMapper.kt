package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.data.movie.model.MoviesUpcomingEntity
import com.example.tvm.data.movie.model.ResultsEntity
import com.example.tvm.domain.interactor.movie.model.Dates
import com.example.tvm.domain.interactor.movie.model.MoviesUpcoming
import com.example.tvm.domain.interactor.movie.model.Results
import javax.inject.Inject

class MoviesUpcomingMapper(
    private val datesMapper: Mapper<DatesEntity, Dates>,
    private val resultsMapper: Mapper<ResultsEntity, Results>
) : Mapper<MoviesUpcomingEntity, MoviesUpcoming> {

    override fun fromEntity(type: MoviesUpcomingEntity): MoviesUpcoming {
        return MoviesUpcoming(
            dates = type.dates?.let { datesMapper.fromEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesUpcoming): MoviesUpcomingEntity {
        return MoviesUpcomingEntity(
            dates = type.dates?.let { datesMapper.toEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }
}