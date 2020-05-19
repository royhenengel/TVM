package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.data.movie.model.MoviesUpcomingEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.domain.interactor.movie.model.Dates
import com.example.tvm.domain.interactor.movie.model.MoviesUpcoming
import com.example.tvm.domain.interactor.movie.model.Movie

class MoviesUpcomingMapper(
    private val datesMapper: Mapper<DatesEntity, Dates>,
    private val movieMapper: Mapper<MovieEntity, Movie>
) : Mapper<MoviesUpcomingEntity, MoviesUpcoming> {

    override fun fromEntity(type: MoviesUpcomingEntity): MoviesUpcoming {
        return MoviesUpcoming(
            dates = type.dates?.let { datesMapper.fromEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesUpcoming): MoviesUpcomingEntity {
        return MoviesUpcomingEntity(
            dates = type.dates?.let { datesMapper.toEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }
}