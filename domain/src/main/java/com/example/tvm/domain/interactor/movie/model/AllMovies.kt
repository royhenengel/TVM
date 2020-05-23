package com.example.tvm.domain.interactor.movie.model

import com.example.tvm.base.result.Result

data class AllMovies(
    val latestMovies: Result<MoviesResults?>,
    val nowPlayingMovies: Result<MoviesResults?>,
    val popularMovies: Result<MoviesResults?>,
    val topRatedMovies: Result<MoviesResults?>,
    val upComingMovies: Result<MoviesResults?>
)