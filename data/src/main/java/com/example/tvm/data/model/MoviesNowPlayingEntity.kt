package com.example.tvm.data.model

import com.example.tvm.data.model.DatesEntity
import com.example.tvm.data.model.ResultsEntity

data class MoviesNowPlayingEntity(
    val dates: DatesEntity?,
    val page: Int?,
    val totalPages: Int?,
    val results: List<ResultsEntity?>?,
    val totalResults: Int?
)