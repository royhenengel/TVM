package com.example.tvm.data.source

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.repository.DataStore
import com.example.tvm.data.repository.Remote
import com.example.tvm.shared.result.SingleResult
import javax.inject.Inject

class RemoteDataStore @Inject constructor(
    private val remote: Remote
) : DataStore {

    override suspend fun item(): SingleResult<ItemEntity> {
        throw UnsupportedOperationException()
    }

}