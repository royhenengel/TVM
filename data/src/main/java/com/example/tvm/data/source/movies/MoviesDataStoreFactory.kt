package com.example.tvm.data.source.movies

import com.example.tvm.data.repository.movies.MoviesDataStore
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