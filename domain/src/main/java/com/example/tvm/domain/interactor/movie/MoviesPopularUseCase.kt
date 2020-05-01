package com.example.tvm.domain.interactor.movie

import com.example.tvm.base.result.Result
import com.example.tvm.domain.interactor.movie.model.MoviesPopular
import com.example.tvm.domain.interactor.movie.model.MoviesTopRated
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesPopularUseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend fun popularMovies(): Result<MoviesPopular?> {
        return moviesRepository.popular(
            language = TODO(),
            page = TODO()
        )
    }
}