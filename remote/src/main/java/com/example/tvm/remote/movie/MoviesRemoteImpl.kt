package com.example.tvm.remote.movie

import com.example.tvm.base.logging.Logger
import com.example.tvm.base.result.Result
import com.example.tvm.data.movie.model.*
import com.example.tvm.data.movie.repository.MoviesRemote
import com.example.tvm.remote.config.RemoteConfig
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.module.RemoteBindsModule
import com.example.tvm.remote.movie.model.*
import com.example.tvm.remote.movie.service.ServiceMovies
import javax.inject.Named

class MoviesRemoteImpl (
    @Named(RemoteBindsModule.CONFIG_REMOTE_TMDB) private val remoteConfig: RemoteConfig,
    private val logger: Logger,
    private val service: ServiceMovies,
    private val moviesResultsMapper: EntityMapper<MoviesResultsModel, MoviesResultsEntity>,
    private val movieDetailsEntityMapper: EntityMapper<MovieDetailsModel, MovieDetailsEntity>
) : MoviesRemote {

    private companion object {
        private const val MESSAGE_GENERAL_ERROR = "Movies API error"
    }

    override suspend fun latest(
        language: String,
        page: Int
    ): Result<MoviesResultsEntity?> {
        return try {
            val response = service.latest(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { moviesResultsMapper.fromRemote(it) }
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
    ): Result<MoviesResultsEntity?> {
        return try {
            val response = service.nowPlaying(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { moviesResultsMapper.fromRemote(it) }
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
    ): Result<MoviesResultsEntity?> {
        return try {
            val response = service.popular(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { moviesResultsMapper.fromRemote(it) }
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
    ): Result<MoviesResultsEntity?> {
        return try {
            val response = service.topRated(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { moviesResultsMapper.fromRemote(it) }
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
    ): Result<MoviesResultsEntity?> {
        return try {
            val response = service.upcoming(
                key = remoteConfig.apiKey(),
                language = language,
                page = page
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { moviesResultsMapper.fromRemote(it) }
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

    override suspend fun details(
        movieId: Int,
        language: String
    ): Result<MovieDetailsEntity?> {
        return try {
            val response = service.details(
                key = remoteConfig.apiKey(),
                language = language,
                movieId = movieId
            )

            val body = response.body()
            when {
                response.isSuccessful -> Result.Success(
                    body?.let { movieDetailsEntityMapper.fromRemote(it) }
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
    override suspend fun cast(movieId: Int, language: String) {
        throw UnsupportedOperationException()
    }

}