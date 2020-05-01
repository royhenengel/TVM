package com.example.tvm.data.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.MoviesNowPlayingEntity
import com.example.tvm.domain.interactor.movie.model.MoviesNowPlaying
import javax.inject.Inject

class MoviesNowPlayingMapper @Inject constructor(
    private val datesMapper: DatesMapper, // TODO Inject interface instead of concrete impl
    private val resultsMapper: ResultsMapper // TODO Inject interface instead of concrete impl
) : Mapper<MoviesNowPlayingEntity, MoviesNowPlaying> {

    override fun fromEntity(type: MoviesNowPlayingEntity): MoviesNowPlaying {
        return MoviesNowPlaying(
            dates = type.dates?.let { datesMapper.fromEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.fromEntity(it) },
            totalResults = type.totalResults
        )
    }

    override fun toEntity(type: MoviesNowPlaying): MoviesNowPlayingEntity {
        return MoviesNowPlayingEntity(
            dates = type.dates?.let { datesMapper.toEntity(it) },
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.toEntity(it) },
            totalResults = type.totalResults
        )
    }
}