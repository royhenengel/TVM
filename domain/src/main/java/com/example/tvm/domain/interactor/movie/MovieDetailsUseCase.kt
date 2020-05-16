package com.example.tvm.domain.interactor.movie

import com.example.tvm.base.result.Result
import com.example.tvm.domain.interactor.movie.model.MovieDetails
import com.example.tvm.domain.interactor.movie.model.MoviesLatest
import com.example.tvm.domain.interactor.movie.model.MoviesPopular
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MovieDetailsUseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    suspend fun details(): Result<MovieDetails?> {
        return moviesRepository.details(
            language = TODO(),
            movieId = TODO()
        )
    }
}