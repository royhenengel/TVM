package com.example.tvm.data.movie.repository

import com.example.tvm.data.model.*
import com.example.tvm.base.result.Result
import com.example.tvm.data.model.MoviesLatestEntity
import com.example.tvm.data.model.MoviesNowPlayingEntity

interface MoviesRemote {

    suspend fun latest(language: String, page: Int): Result<MoviesLatestEntity?>

    suspend fun nowPlaying(language: String, page: Int): Result<MoviesNowPlayingEntity?>

    suspend fun popular(language: String, page: Int): Result<MoviesPopularEntity?>

    suspend fun topRated(language: String, page: Int): Result<MoviesTopRatedEntity?>

    suspend fun upcoming(language: String, page: Int): Result<MoviesUpcomingEntity?>

    @Throws(UnsupportedOperationException::class)
    suspend fun details(movieId: Int, language: String)

    @Throws(UnsupportedOperationException::class)
    suspend fun cast(movieId: Int, language: String)

}