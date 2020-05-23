package com.example.tvm.domain.interactor.movie

import com.example.tvm.base.result.Result
import com.example.tvm.domain.interactor.movie.model.MoviesResults
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesLatestUseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend fun latestMovies(): Result<MoviesResults?> {
        return moviesRepository.latest(
            language = TODO(),
            page = TODO()
        )
    }
}