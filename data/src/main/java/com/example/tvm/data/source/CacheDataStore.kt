package com.example.tvm.data.source

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.repository.Cache
import com.example.tvm.data.repository.DataStore
import javax.inject.Inject

class CacheDataStore @Inject constructor(
    private val cache: Cache
): DataStore {

    override fun item(): ItemEntity {
        throw UnsupportedOperationException()
    }

}