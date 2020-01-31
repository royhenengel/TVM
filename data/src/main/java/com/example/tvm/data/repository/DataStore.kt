package com.example.tvm.data.repository

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.shared.result.SingleResult

interface DataStore {

    @Throws(UnsupportedOperationException::class)
    suspend fun item(): SingleResult<ItemEntity>

}