package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.model.DatesEntity
import com.example.tvm.data.model.MoviesNowPlayingEntity
import com.example.tvm.data.model.ResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.DatesModel
import com.example.tvm.remote.movie.model.MoviesNowPlayingModel
import com.example.tvm.remote.movie.model.ResultsModel
import javax.inject.Inject

class MoviesNowPlayingMapper @Inject constructor(
    private val datesMapper: DatesMapper,
    private val resultsMapper: ResultsMapper
): EntityMapper<MoviesNowPlayingModel, MoviesNowPlayingEntity> {
    
    override fun fromRemote(type: MoviesNowPlayingModel): MoviesNowPlayingEntity {
        return MoviesNowPlayingEntity(
            dates = type.dates?.let { datesMapper.fromRemote(it) },
            page = type.page,
            totalPages = type.totalPages,
            results = type.results?.map { resultsMapper.fromRemote(it) },
            totalResults = type.totalResults
        )
    }
}