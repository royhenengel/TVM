package com.example.tvm.data.source.movies

import com.example.tvm.data.repository.movies.MoviesDataStore
import com.example.tvm.data.repository.movies.MoviesRemote
import javax.inject.Inject

class MoviesRemoteDataSource @Inject constructor(
    private val moviesRemote: MoviesRemote
) : MoviesDataStore