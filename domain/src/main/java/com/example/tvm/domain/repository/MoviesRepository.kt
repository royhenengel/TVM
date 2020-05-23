package com.example.tvm.domain.repository

import com.example.tvm.base.result.Result
import com.example.tvm.domain.interactor.movie.model.*

interface MoviesRepository {

    suspend fun latest(language: String, page: Int): Result<MoviesResults?>

    suspend fun nowPlaying(language: String, page: Int): Result<MoviesResults?>

    suspend fun popular(language: String, page: Int): Result<MoviesResults?>

    suspend fun topRated(language: String, page: Int): Result<MoviesResults?>

    suspend fun upcoming(language: String, page: Int): Result<MoviesResults?>

    suspend fun details(movieId: Int, language: String): Result<MovieDetails?>

    suspend fun cast(movieId: Int, language: String)

}