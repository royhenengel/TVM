package com.example.tvm.data.source

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.data.repository.DataStore
import com.example.tvm.data.repository.Remote
import com.example.tvm.base.result.Result
import javax.inject.Inject

class RemoteDataStore @Inject constructor(
    private val remote: Remote
) : DataStore {

    override suspend fun item(): Result<ItemEntity> {
        throw UnsupportedOperationException()
    }

}