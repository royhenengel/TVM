package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.model.DatesEntity
import com.example.tvm.data.model.MoviesUpcomingEntity
import com.example.tvm.data.model.ResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.DatesModel
import com.example.tvm.remote.movie.model.MoviesUpcomingModel
import com.example.tvm.remote.movie.model.ResultsModel
import javax.inject.Inject

class MoviesUpcomingMapper @Inject constructor(
	private val datesMapper: DatesMapper,
	private val resultsMapper: ResultsMapper
): EntityMapper<MoviesUpcomingModel, MoviesUpcomingEntity> {

	override fun fromRemote(type: MoviesUpcomingModel): MoviesUpcomingEntity {
		return MoviesUpcomingEntity(
			dates = type.dates?.let { datesMapper.fromRemote(it) },
			page = type.page,
			totalPages = type.totalPages,
			results = type.results?.map { resultsMapper.fromRemote(it) },
			totalResults = type.totalResults
		)
	}
}