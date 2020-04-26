package com.example.tvm.data.repository

import com.example.tvm.data.model.ItemEntity
import com.example.tvm.base.result.Result

interface DataStore {

    @Throws(UnsupportedOperationException::class)
    suspend fun item(): Result<ItemEntity>

}