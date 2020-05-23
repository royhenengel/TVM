package com.example.tvm.remote.interceptor

import com.example.tvm.remote.config.RemoteConfig
import okhttp3.Interceptor
import okhttp3.Response

class CommonQueryInterceptor(
    private val remoteConfig: RemoteConfig
): Interceptor {

    private companion object {
        private const val QUERY_API_KEY = "api_key"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val urlBuilder = chain.request().url.newBuilder()
            .addQueryParameter(QUERY_API_KEY, remoteConfig.apiKey())

        return chain.proceed(
            chain.request().newBuilder()
                .url(url = urlBuilder.build())
                .build()
        )
    }
}