package com.example.tvm.data.movie.source

import com.example.tvm.data.movie.repository.MoviesDataStore
import javax.inject.Inject

class MoviesDataStoreFactory @Inject constructor(
    private val cacheDataSource: MoviesCacheDataSource,
    private val remoteDataSource: MoviesRemoteDataSource
) {

    fun cache(): MoviesDataStore {
        return cacheDataSource
    }

    fun remote(): MoviesDataStore {
        return remoteDataSource
    }

}