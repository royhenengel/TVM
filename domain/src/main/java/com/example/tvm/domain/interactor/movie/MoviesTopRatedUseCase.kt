package com.example.tvm.domain.interactor.movie

import com.example.tvm.base.result.Result
import com.example.tvm.domain.interactor.movie.model.MoviesResults
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesTopRatedUseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {
    private companion object {
        private const val DEFAULT_LANGUAGE = "en-US"
        private const val DEFAULT_PAGE = 1
    }

    suspend fun topRatedMovies(language: String = DEFAULT_LANGUAGE,
                               page: Int = DEFAULT_PAGE
    ): Result<MoviesResults?> {
        return moviesRepository.topRated(
            language = language,
            page = page
        )
    }
}