package com.example.tvm.data.source

import com.example.tvm.data.repository.DataStore
import javax.inject.Inject

class DataStoreFactory @Inject constructor(
    private val cacheDataStore: CacheDataStore,
    private val remoteDataStore: RemoteDataStore
) {

    fun cacheDataStore(): DataStore {
        return cacheDataStore
    }

    fun remoteDataStore(): DataStore {
        return remoteDataStore
    }

}