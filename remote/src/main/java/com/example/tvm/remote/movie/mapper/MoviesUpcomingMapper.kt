package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.model.DatesEntity
import com.example.tvm.data.model.MoviesUpcomingEntity
import com.example.tvm.data.model.ResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.DatesModel
import com.example.tvm.remote.movie.model.MoviesUpcomingModel
import com.example.tvm.remote.movie.model.ResultsModel
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class MoviesUpcomingMapper @Inject constructor(
	private val datesMapper: Mapper<DatesEntity, DatesModel>,
	private val resultsMapper: Mapper<ResultsEntity, ResultsModel>
): EntityMapper<MoviesUpcomingModel, MoviesUpcomingEntity> {

	override fun fromRemote(type: MoviesUpcomingModel): MoviesUpcomingEntity {
		return MoviesUpcomingEntity(
			dates = type.dates?.let { datesMapper.toEntity(it) },
			page = type.page,
			totalPages = type.totalPages,
			results = type.results?.map { resultsMapper.toEntity(it) },
			totalResults = type.totalResults
		)
	}
}