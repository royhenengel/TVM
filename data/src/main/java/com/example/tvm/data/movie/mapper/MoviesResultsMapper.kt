package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.data.movie.model.MoviesResultsEntity
import com.example.tvm.domain.interactor.movie.model.Dates
import com.example.tvm.domain.interactor.movie.model.Movie
import com.example.tvm.domain.interactor.movie.model.MoviesResults

class MoviesResultsMapper(
    private val datesMapper: Mapper<DatesEntity, Dates>,
    private val movieMapper: Mapper<MovieEntity, Movie>
) : Mapper<MoviesResultsEntity, MoviesResults> {

    override fun fromEntity(type: MoviesResultsEntity): MoviesResults {
        return MoviesResults(
            dates = type.dates?.let { datesMapper.fromEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesResults): MoviesResultsEntity {
        return MoviesResultsEntity(
            dates = type.dates?.let { datesMapper.toEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }
}