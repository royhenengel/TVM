package com.example.tvm.domain.interactor

import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class UseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
)