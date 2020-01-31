package com.example.tvm.domain.interactor

import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.Repository
import com.example.tvm.shared.result.SingleResult
import javax.inject.Inject

class UseCase @Inject constructor(
    private val repository: Repository
) {

    suspend fun item(): SingleResult<Item> {
        return repository.item()
    }

}