package com.example.tvm.remote.module

import com.example.tvm.data.movie.repository.MoviesRemote
import com.example.tvm.remote.config.RemoteConfig
import com.example.tvm.remote.config.RemoteConfigTmdb
import com.example.tvm.remote.movie.MoviesRemoteImpl
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class BindsModule {

    companion object {
        const val CONFIG_REMOTE_TMDB = "CONFIG_REMOTE_TMDB"
    }

    @Binds
    @Named(CONFIG_REMOTE_TMDB)
    abstract fun bindTmdbRemoteConfig(impl: RemoteConfigTmdb): RemoteConfig

    @Binds
    abstract fun bindRemoteMovies(impl: MoviesRemoteImpl): MoviesRemote

}