package com.example.tvm.remote.config

import javax.inject.Inject

class RemoteConfigTmdb @Inject constructor() : RemoteConfig {

    private companion object {
        private const val TMDB_BASE_URL = "https://api.themoviedb.org/"
        private const val TMDB_KEY = "66210bf07df26bb1ee13d33f9f14056e"
    }

    override fun baseUrl(): String = TMDB_BASE_URL

    override fun apiKey(): String = TMDB_KEY

    override fun timeoutMillisConnection(): Long = DEFAULT_CONNECTION_TIMEOUT

    override fun timeoutMillisSocket(): Long = DEFAULT_SOCKET_TIMEOUT
}