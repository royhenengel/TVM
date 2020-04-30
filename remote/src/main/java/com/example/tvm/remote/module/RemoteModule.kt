package com.example.tvm.remote.module

import com.example.tvm.remote.RetrofitProvider
import com.example.tvm.remote.RetrofitProviderImpl
import com.example.tvm.remote.config.RemoteConfig
import com.example.tvm.remote.module.BindsModule.Companion.CONFIG_REMOTE_TMDB
import com.example.tvm.remote.movie.service.ServiceMovies
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module(includes = [BindsModule::class])
object RemoteModule {

    private const val RETROFIT_PROVIDER_TMDB = "RETROFIT_PROVIDER_TMDB"

    @JvmStatic
    @Provides
    @Named(RETROFIT_PROVIDER_TMDB)
    fun provideRemoteTmdb(
        @Named(CONFIG_REMOTE_TMDB) remoteConfig: RemoteConfig
    ): RetrofitProvider = RetrofitProviderImpl(remoteConfig)

    @JvmStatic
    @Provides
    fun provideMoviesService(
        @Named(RETROFIT_PROVIDER_TMDB) retrofitProvider: RetrofitProvider
    ): ServiceMovies = retrofitProvider.retrofit().create(ServiceMovies::class.java)

}