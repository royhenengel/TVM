package com.example.tvm.data.movie.repository

import com.example.tvm.base.result.Result
import com.example.tvm.data.movie.model.*

interface MoviesRemote {

    suspend fun latest(language: String, page: Int): Result<MoviesResultsEntity?>

    suspend fun nowPlaying(language: String, page: Int): Result<MoviesResultsEntity?>

    suspend fun popular(language: String, page: Int): Result<MoviesResultsEntity?>

    suspend fun topRated(language: String, page: Int): Result<MoviesResultsEntity?>

    suspend fun upcoming(language: String, page: Int): Result<MoviesResultsEntity?>

    suspend fun details(movieId: Int, language: String): Result<MovieDetailsEntity?>

    @Throws(UnsupportedOperationException::class)
    suspend fun cast(movieId: Int, language: String)

}