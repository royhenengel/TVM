package com.example.tvm.data.movie.repository

import com.example.tvm.data.movie.source.MoviesDataStoreFactory
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val moviesDataStoreFactory: MoviesDataStoreFactory
) : MoviesRepository