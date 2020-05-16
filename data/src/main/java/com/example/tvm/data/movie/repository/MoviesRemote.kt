package com.example.tvm.data.movie.repository

import com.example.tvm.base.result.Result
import com.example.tvm.data.movie.model.*

interface MoviesRemote {

    suspend fun latest(language: String, page: Int): Result<MoviesLatestEntity?>

    suspend fun nowPlaying(language: String, page: Int): Result<MoviesNowPlayingEntity?>

    suspend fun popular(language: String, page: Int): Result<MoviesPopularEntity?>

    suspend fun topRated(language: String, page: Int): Result<MoviesTopRatedEntity?>

    suspend fun upcoming(language: String, page: Int): Result<MoviesUpcomingEntity?>

    suspend fun details(movieId: Int, language: String): Result<MovieDetailsEntity?>

    @Throws(UnsupportedOperationException::class)
    suspend fun cast(movieId: Int, language: String)

}