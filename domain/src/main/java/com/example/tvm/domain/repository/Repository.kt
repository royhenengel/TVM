package com.example.tvm.domain.repository

import com.example.tvm.domain.model.Item
import com.example.tvm.shared.result.SingleResult

interface Repository {

    suspend fun item(): SingleResult<Item>
}