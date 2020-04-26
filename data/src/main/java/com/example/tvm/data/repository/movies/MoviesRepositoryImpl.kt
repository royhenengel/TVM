package com.example.tvm.data.repository.movies

import com.example.tvm.data.source.movies.MoviesDataStoreFactory
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val dataStoreFactory: MoviesDataStoreFactory
) : MoviesRepository