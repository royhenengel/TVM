package com.example.tvm.domain.interactor.movie

import com.example.tvm.domain.interactor.movie.model.AllMovies
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AllMoviesUseCase @Inject constructor(
    val moviesLatestUseCase: MoviesLatestUseCase,
    val moviesNowPlayingUseCase: MoviesNowPlayingUseCase,
    val moviesPopularUseCase: MoviesPopularUseCase,
    val moviesTopRatedUseCase: MoviesTopRatedUseCase,
    val moviesUpcomingUseCase: MoviesUpcomingUseCase
) {
    suspend fun allMovies(): AllMovies = withContext(Dispatchers.Default) {
        val latestMoviesAsync = async { moviesLatestUseCase.latestMovies() }
        val nowPlayingMoviesAsync = async { moviesNowPlayingUseCase.nowPlaying() }
        val popularMoviesAsync = async { moviesPopularUseCase.popularMovies() }
        val topRatedMoviesAsync = async { moviesTopRatedUseCase.topRatedMovies() }
        val upComingMoviesAsync = async { moviesUpcomingUseCase.upcomingMovies() }

        val latestMovies = latestMoviesAsync.await()
        val nowPlayingMovies = nowPlayingMoviesAsync.await()
        val popularMovies = popularMoviesAsync.await()
        val topRatedMovies = topRatedMoviesAsync.await()
        val upComingMovies = upComingMoviesAsync.await()

        AllMovies(
            latestMovies = latestMovies,
            nowPlayingMovies = nowPlayingMovies,
            popularMovies = popularMovies,
            topRatedMovies = topRatedMovies,
            upComingMovies = upComingMovies
        )
    }

}