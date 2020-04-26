package com.example.tvm.data.source.movies

import com.example.tvm.data.repository.movies.MoviesCache
import com.example.tvm.data.repository.movies.MoviesDataStore
import javax.inject.Inject

class MoviesCacheDataSource @Inject constructor(
    private val moviesCache: MoviesCache
): MoviesDataStore