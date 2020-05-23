package com.example.tvm.domain.interactor.movie

import com.example.tvm.base.result.Result
import com.example.tvm.domain.interactor.movie.model.MoviesResults
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesNowPlayingUseCase @Inject constructor(
    private val moviesRepository: MoviesRepository
) {

    suspend fun nowPlaying(): Result<MoviesResults?> {
        return moviesRepository.nowPlaying(
            language = TODO(),
            page = TODO()
        )
    }

}