package com.example.tvm.remote.movie.mapper

import com.example.tvm.data.model.MoviesTopRatedEntity
import com.example.tvm.data.model.ResultsEntity
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.model.MoviesTopRatedModel
import com.example.tvm.remote.movie.model.ResultsModel
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class MoviesTopRatedMapper @Inject constructor(
	private val resultsMapper: EntityMapper<ResultsModel, ResultsEntity>
): EntityMapper<MoviesTopRatedModel, MoviesTopRatedEntity>{

	override fun fromRemote(type: MoviesTopRatedModel): MoviesTopRatedEntity {
		return MoviesTopRatedEntity(
			page = type.page,
			totalPages = type.totalPages,
			results = type.results?.map { resultsMapper.fromRemote(it) },
			totalResults = type.totalResults
		)
	}

}