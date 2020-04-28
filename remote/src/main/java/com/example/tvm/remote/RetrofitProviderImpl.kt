package com.example.tvm.remote

import com.example.tvm.remote.config.RemoteConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitProviderImpl (private val configuration: RemoteConfig):
    RetrofitProvider {

    override fun retrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(configuration.baseUrl())
            .addConverterFactory(GsonConverterFactory.create())
            .client(
                OkHttpClient()
                    .newBuilder()
                    .apply {
                        this.addInterceptor(HttpLoggingInterceptor().apply {
                            level = HttpLoggingInterceptor.Level.BODY
                        })
                        this.connectTimeout(configuration.timeoutMillisConnection(), TimeUnit.MILLISECONDS)
                        this.readTimeout(configuration.timeoutMillisConnection(), TimeUnit.MILLISECONDS)
                    }
                    .build()
            )
            .build()
    }
}