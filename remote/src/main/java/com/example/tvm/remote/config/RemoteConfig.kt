package com.example.tvm.remote.config

const val DEFAULT_CONNECTION_TIMEOUT = 20000L

const val DEFAULT_SOCKET_TIMEOUT = 45000L

interface RemoteConfig {

    fun baseUrl(): String

    fun apiKey(): String

    fun timeoutMillisConnection(): Long

    fun timeoutMillisSocket(): Long
}