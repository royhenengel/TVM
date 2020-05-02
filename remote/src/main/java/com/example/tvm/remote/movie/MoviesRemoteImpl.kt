package com.example.tvm.remote.movie

import com.example.tvm.base.logging.Logger
import com.example.tvm.base.result.Result
import com.example.tvm.data.movie.model.*
import com.example.tvm.data.movie.repository.MoviesRemote
import com.example.tvm.remote.config.RemoteConfig
import com.example.tvm.remote.module.BindsModule
import com.example.tvm.remote.movie.mapper.*
import com.example.tvm.remote.movie.service.ServiceMovies
import javax.inject.Inject
import javax.inject.Named

class MoviesRemoteImpl @Inject constructor(
    @Named(BindsModule.CONFIG_REMOTE_TMDB) private val remoteConfig: RemoteConfig,
    private val logger: Logger,
    private val service: ServiceMovies,
    private val latestEntityMoviesMapper: EntityMoviesLatestMapper, // TODO Inject interface instead of concrete impl
    private val nowPlayingEntityMoviesMapper: EntityMoviesNowPlayingMapper, // TODO Inject interface instead of concrete impl
    private val popularEntityMoviesMapper: EntityMoviesPopularMapper, // TODO Inject interface instead of concrete impl
    private val topRatedEntityMoviesMapper: EntityMoviesTopRatedMapper, // TODO Inject interface instead of concrete impl
    private val upComingEntityMoviesMapper: EntityMoviesUpcomingMapper // TODO Inject interface instead of concrete impl
) : MoviesRemote {

    private companion object {
        private const val MESSAGE_GENERAL_ERROR = "Error getting movies from the API"
    }

    override suspend fun latest(
        language: String,
        page: Int
    ): Result<MoviesLatestEntity?> {
        return try {
            val response = service.latest(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { latestEntityMoviesMapper.fromRemote(it) }
                )

                else -> Result.Error(
                    Exception(MESSAGE_GENERAL_ERROR)
                )
            }
        } catch (e: Exception) {
            logger.e(e)

            Result.Error(e)
        }
    }

    override suspend fun nowPlaying(
        language: String,
        page: Int
    ): Result<MoviesNowPlayingEntity?> {
        return try {
            val response = service.nowPlaying(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { nowPlayingEntityMoviesMapper.fromRemote(it) }
                )

                else -> Result.Error(
                    Exception(MESSAGE_GENERAL_ERROR)
                )
            }
        } catch (e: Exception) {
            logger.e(e)

            Result.Error(e)
        }
    }

    override suspend fun popular(
        language: String,
        page: Int
    ): Result<MoviesPopularEntity?> {
        return try {
            val response = service.popular(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { popularEntityMoviesMapper.fromRemote(it) }
                )

                else -> Result.Error(
                    Exception(MESSAGE_GENERAL_ERROR)
                )
            }
        } catch (e: Exception) {
            logger.e(e)

            Result.Error(e)
        }
    }

    override suspend fun topRated(
        language: String,
        page: Int
    ): Result<MoviesTopRatedEntity?> {
        return try {
            val response = service.topRated(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { topRatedEntityMoviesMapper.fromRemote(it) }
                )

                else -> Result.Error(
                    Exception(MESSAGE_GENERAL_ERROR)
                )
            }
        } catch (e: Exception) {
            logger.e(e)

            Result.Error(e)
        }
    }

    override suspend fun upcoming(
        language: String,
        page: Int
    ): Result<MoviesUpcomingEntity?> {
        return try {
            val response = service.upcoming(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { upComingEntityMoviesMapper.fromRemote(it) }
                )

                else -> Result.Error(
                    Exception(MESSAGE_GENERAL_ERROR)
                )
            }
        } catch (e: Exception) {
            logger.e(e)

            Result.Error(e)
        }
    }

    @Throws(UnsupportedOperationException::class)
    override suspend fun details(movieId: Int, language: String) {
        throw UnsupportedOperationException()
    }

    @Throws(UnsupportedOperationException::class)
    override suspend fun cast(movieId: Int, language: String) {
        throw UnsupportedOperationException()
    }

}