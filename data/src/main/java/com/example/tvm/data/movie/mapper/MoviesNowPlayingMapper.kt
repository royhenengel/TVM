package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.DatesEntity
import com.example.tvm.data.movie.model.MoviesNowPlayingEntity
import com.example.tvm.data.movie.model.MovieEntity
import com.example.tvm.domain.interactor.movie.model.Dates
import com.example.tvm.domain.interactor.movie.model.MoviesNowPlaying
import com.example.tvm.domain.interactor.movie.model.Movie

class MoviesNowPlayingMapper(
    private val datesMapper: Mapper<DatesEntity, Dates>,
    private val movieMapper: Mapper<MovieEntity, Movie>
) : Mapper<MoviesNowPlayingEntity, MoviesNowPlaying> {

    override fun fromEntity(type: MoviesNowPlayingEntity): MoviesNowPlaying {
        return MoviesNowPlaying(
            dates = type.dates?.let { datesMapper.fromEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesNowPlaying): MoviesNowPlayingEntity {
        return MoviesNowPlayingEntity(
            dates = type.dates?.let { datesMapper.toEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            movies = type.movies?.map { movieMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }
}