package com.example.tvm.data.movie.source

import com.example.tvm.data.movie.repository.MoviesDataStore
import com.example.tvm.data.movie.repository.MoviesRemote
import com.example.tvm.base.result.Result
import com.example.tvm.data.movie.model.*
import javax.inject.Inject

class MoviesRemoteDataSource @Inject constructor(
    private val moviesRemote: MoviesRemote
) : MoviesDataStore {

    override suspend fun latest(
        language: String,
        page: Int
    ): Result<MoviesLatestEntity?> = moviesRemote.latest(
        page = page,
        language = language
    )

    override suspend fun nowPlaying(
        language: String,
        page: Int
    ): Result<MoviesNowPlayingEntity?> = moviesRemote.nowPlaying(
        page = page,
        language = language
    )

    override suspend fun popular(
        language: String,
        page: Int
    ): Result<MoviesPopularEntity?> = moviesRemote.popular(
        page = page,
        language = language
    )

    override suspend fun topRated(
        language: String,
        page: Int
    ): Result<MoviesTopRatedEntity?> = moviesRemote.topRated(
        page = page,
        language = language
    )

    override suspend fun upcoming(
        language: String,
        page: Int
    ): Result<MoviesUpcomingEntity?> = moviesRemote.upcoming(
        page = page,
        language = language
    )

    override suspend fun details(
        movieId: Int,
        language: String
    ) = moviesRemote.details(
        movieId = movieId,
        language = language
    )

    override suspend fun cast(
        movieId: Int,
        language: String
    ) = moviesRemote.cast(
        movieId = movieId,
        language = language
    )

}