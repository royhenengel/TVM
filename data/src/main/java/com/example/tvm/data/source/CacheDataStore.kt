package com.example.tvm.data.source

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.repository.Cache
import com.example.tvm.data.repository.DataStore
import com.example.tvm.shared.result.SingleResult
import javax.inject.Inject

class CacheDataStore @Inject constructor(
    private val cache: Cache
): DataStore {

    override suspend fun item(): SingleResult<ItemEntity> {
        throw UnsupportedOperationException()
    }

}