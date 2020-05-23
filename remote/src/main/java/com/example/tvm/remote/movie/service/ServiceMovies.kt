package com.example.tvm.remote.movie.service

import com.example.tvm.remote.movie.model.*
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceMovies {

    companion object {
        private const val PATH_ID = "id"

        private const val QUERY_LANGUAGE = "language"
        private const val QUERY_PAGE = "page"
    }

    @GET("3/movie/latest")
    suspend fun latest(
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesResultsModel>

    @GET("3/movie/now_playing")
    suspend fun nowPlaying(
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesResultsModel>

    @GET("3/movie/popular")
    suspend fun popular(
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesResultsModel>

    @GET("3/movie/top_rated")
    suspend fun topRated(
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesResultsModel>

    @GET("3/movie/upcoming")
    suspend fun upcoming(
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesResultsModel>

    @GET("3/movie/{$PATH_ID}")
    suspend fun details(
        @Path(PATH_ID, encoded = true) movieId: Int,
        @Query(QUERY_LANGUAGE) language: String
    ): Response<MovieDetailsModel>

    @GET("3/movie/{$PATH_ID}/casts")
    fun cast(
        @Path(PATH_ID, encoded = true) movieId: Int,
        @Query(QUERY_LANGUAGE) language: String
    ): Response<ResponseBody> // TODO("Implement model")

}