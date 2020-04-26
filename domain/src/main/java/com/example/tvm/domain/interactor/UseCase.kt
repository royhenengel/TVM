package com.example.tvm.domain.interactor

import com.example.tvm.domain.model.Item
import com.example.tvm.domain.repository.MoviesRepository
import com.example.tvm.base.result.Result
import javax.inject.Inject

class UseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {

    suspend fun item(): Result<Item> {
        return moviesRepository.item()
    }

}