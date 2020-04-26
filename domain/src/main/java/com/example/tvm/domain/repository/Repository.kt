package com.example.tvm.domain.repository

import com.example.tvm.domain.model.Item
import com.example.tvm.base.result.Result

interface Repository {

    suspend fun item(): Result<Item>

}