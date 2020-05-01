package com.example.tvm.domain.interactor.movie

import com.example.tvm.base.result.Result
import com.example.tvm.domain.interactor.movie.model.MoviesTopRated
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesTopRatedUseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend fun topRatedMovies(): Result<MoviesTopRated?> {
        return moviesRepository.topRated(
            language = TODO(),
            page = TODO()
        )
    }
}