package com.example.tvm.remote.config

import javax.inject.Inject

class RemoteConfigTmdb @Inject constructor() : RemoteConfig {

    private companion object {
        private const val TMDB_BASE_URL = "https://api.themoviedb.org/"
    }

    override fun baseUrl(): String = TMDB_BASE_URL

    override fun apiKey(): String {
        TODO("not implemented")
    }

    override fun timeoutMillisConnection(): Long = DEFAULT_CONNECTION_TIMEOUT

    override fun timeoutMillisSocket(): Long = DEFAULT_SOCKET_TIMEOUT
}