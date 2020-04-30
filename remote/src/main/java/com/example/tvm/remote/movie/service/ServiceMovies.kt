package com.example.tvm.remote.movie.service

import com.example.tvm.remote.movie.model.*
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServiceMovies {

    @GET("3/movie/latest")
    fun latest(
        @Query(QUERY_API_KEY) key: String,
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesLatestModel>

    @GET("3/movie/now_playing")
    fun nowPlaying(
        @Query(QUERY_API_KEY) key: String,
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesNowPlayingModel>

    @GET("3/movie/popular")
    fun popular(
        @Query(QUERY_API_KEY) key: String,
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesPopularModel>

    @GET("3/movie/top_rated")
    fun topRated(
        @Query(QUERY_API_KEY) key: String,
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesTopRatedModel>

    @GET("3/movie/upcoming")
    fun upcoming(
        @Query(QUERY_API_KEY) key: String,
        @Query(QUERY_LANGUAGE) language: String,
        @Query(QUERY_PAGE) page: Int
    ): Response<MoviesUpcomingModel>

    @GET("3/movie/{$PATH_ID}")
    fun details(
        @Path(PATH_ID, encoded = true) movieId: Int,
        @Query(QUERY_API_KEY) key: String,
        @Query(QUERY_LANGUAGE) language: String
    ): Response<ResponseBody> // TODO("Implement model")

    @GET("3/movie/{$PATH_ID}/casts")
    fun cast(
        @Path(PATH_ID, encoded = true) movieId: Int,
        @Query(QUERY_API_KEY) key: String,
        @Query(QUERY_LANGUAGE) language: String
    ): Response<ResponseBody> // TODO("Implement model")

    companion object {
        private const val PATH_ID = "id"

        private const val QUERY_API_KEY = "api_key"
        private const val QUERY_LANGUAGE = "language"
        private const val QUERY_PAGE = "page"
    }
}