package com.example.tvm.domain.interactor.movie

import com.example.tvm.base.result.Result
import com.example.tvm.domain.interactor.movie.model.MoviesUpcoming
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesUpcomingUseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend fun upcomingMovies(): Result<MoviesUpcoming?> {
        return moviesRepository.upcoming(
            language = TODO(),
            page = TODO()
        )
    }
}