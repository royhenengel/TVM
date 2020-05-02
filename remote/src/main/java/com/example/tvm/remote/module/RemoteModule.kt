package com.example.tvm.remote.module

import com.example.tvm.remote.RetrofitProvider
import com.example.tvm.remote.RetrofitProviderImpl
import com.example.tvm.remote.config.RemoteConfig
import com.example.tvm.remote.module.RemoteBindsModule.Companion.CONFIG_REMOTE_TMDB
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module(includes = [
    MoviesModule::class,
    RemoteBindsModule::class
])
object RemoteModule {

    const val RETROFIT_PROVIDER_TMDB = "RETROFIT_PROVIDER_TMDB"

    @JvmStatic
    @Provides
    @Named(RETROFIT_PROVIDER_TMDB)
    fun provideTmdbRetrofitProvider(
        @Named(CONFIG_REMOTE_TMDB) remoteConfig: RemoteConfig
    ): RetrofitProvider = RetrofitProviderImpl(remoteConfig)

}