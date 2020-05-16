package com.example.tvm.data.movie.source

import com.example.tvm.data.movie.repository.MoviesCache
import com.example.tvm.data.movie.repository.MoviesDataStore
import com.example.tvm.base.result.Result
import com.example.tvm.data.movie.model.*
import javax.inject.Inject

class MoviesCacheDataSource @Inject constructor(
    private val moviesCache: MoviesCache
) : MoviesDataStore {

    @Throws(UnsupportedOperationException::class)
    override suspend fun latest(
        language: String,
        page: Int
    ): Result<MoviesLatestEntity?> = throw UnsupportedOperationException()

    @Throws(UnsupportedOperationException::class)
    override suspend fun nowPlaying(
        language: String,
        page: Int
    ): Result<MoviesNowPlayingEntity?> = throw UnsupportedOperationException()

    @Throws(UnsupportedOperationException::class)
    override suspend fun popular(
        language: String,
        page: Int
    ): Result<MoviesPopularEntity?> = throw UnsupportedOperationException()

    @Throws(UnsupportedOperationException::class)
    override suspend fun topRated(
        language: String,
        page: Int
    ): Result<MoviesTopRatedEntity?> = throw UnsupportedOperationException()

    @Throws(UnsupportedOperationException::class)
    override suspend fun upcoming(
        language: String,
        page: Int
    ): Result<MoviesUpcomingEntity?> = throw UnsupportedOperationException()

    @Throws(UnsupportedOperationException::class)
    override suspend fun details(
        movieId: Int,
        language: String
    ): Result<MovieDetailsEntity?> = throw UnsupportedOperationException()

    @Throws(UnsupportedOperationException::class)
    override suspend fun cast(movieId: Int,  language: String) =
        throw UnsupportedOperationException()

}