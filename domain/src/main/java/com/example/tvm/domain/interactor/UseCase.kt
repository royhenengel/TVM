package com.example.tvm.domain.interactor

import com.example.tvm.domain.model.Bo
import com.example.tvm.domain.repository.Repository
import javax.inject.Inject

class UseCase @Inject constructor(
    private val repository: Repository
) {
    suspend fun item(): Bo {
        return repository.item()
    }

}