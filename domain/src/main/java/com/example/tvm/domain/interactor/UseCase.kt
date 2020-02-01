package com.example.tvm.domain.interactor

import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.Repository
import com.example.tvm.shared.result.Result
import javax.inject.Inject

class UseCase @Inject constructor(
    private val repository: Repository
) {

    suspend fun item(): Result<Item> {
        return repository.item()
    }

}