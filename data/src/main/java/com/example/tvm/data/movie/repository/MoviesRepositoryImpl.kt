package com.example.tvm.data.movie.repository

import com.example.tvm.base.result.Result
import com.example.tvm.data.mapper.Mapper
import com.example.tvm.data.movie.model.*
import com.example.tvm.data.movie.source.MoviesDataStoreFactory
import com.example.tvm.domain.interactor.movie.model.*
import com.example.tvm.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val dataStoreFactory: MoviesDataStoreFactory,
    private val latestMoviesMapper: Mapper<MoviesLatestEntity, MoviesLatest>,
    private val nowPlayingMoviesMapper: Mapper<MoviesNowPlayingEntity, MoviesNowPlaying>,
    private val popularMoviesMapper: Mapper<MoviesPopularEntity, MoviesPopular>,
    private val topRatedMoviesMapper: Mapper<MoviesTopRatedEntity, MoviesTopRated>,
    private val upComingMoviesMapper: Mapper<MoviesUpcomingEntity, MoviesUpcoming>
) : MoviesRepository {

    override suspend fun latest(language: String, page: Int): Result<MoviesLatest?> {
        return try {
            val result = dataStoreFactory.remote().latest(
                language = language,
                page = page
            )

            when(result) {
                is Result.Success -> Result.Success(
                    data = result.data?.let { latestMoviesMapper.fromEntity(it) }
                )

                is Result.Error -> Result.Error(result.exception)
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun nowPlaying(language: String, page: Int): Result<MoviesNowPlaying?> {
        return try {
            val result = dataStoreFactory.remote().nowPlaying(
                language = language,
                page = page
            )

            when(result) {
                is Result.Success -> Result.Success(
                    data = result.data?.let { nowPlayingMoviesMapper.fromEntity(it) }
                )

                is Result.Error -> Result.Error(result.exception)
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun popular(language: String, page: Int): Result<MoviesPopular?> {
        return try {
            val result = dataStoreFactory.remote().popular(
                language = language,
                page = page
            )

            when(result) {
                is Result.Success -> Result.Success(
                    data = result.data?.let { popularMoviesMapper.fromEntity(it) }
                )

                is Result.Error -> Result.Error(result.exception)
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun topRated(language: String, page: Int): Result<MoviesTopRated?> {
        return try {
            val result = dataStoreFactory.remote().topRated(
                language = language,
                page = page
            )

            when(result) {
                is Result.Success -> Result.Success(
                    data = result.data?.let { topRatedMoviesMapper.fromEntity(it) }
                )

                is Result.Error -> Result.Error(result.exception)
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun upcoming(language: String, page: Int): Result<MoviesUpcoming?> {
        return try {
            val result = dataStoreFactory.remote().upcoming(
                language = language,
                page = page
            )

            when(result) {
                is Result.Success -> Result.Success(
                    data = result.data?.let { upComingMoviesMapper.fromEntity(it) }
                )

                is Result.Error -> Result.Error(result.exception)
            }
        } catch (e: Exception) {
            Result.Error(e)
        }
    }

    override suspend fun details(movieId: Int, language: String) {
        TODO("not implemented")
    }

    override suspend fun cast(movieId: Int, language: String) {
        TODO("not implemented")
    }
}