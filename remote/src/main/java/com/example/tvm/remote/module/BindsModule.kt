package com.example.tvm.remote.module

import com.example.tvm.data.model.*
import com.example.tvm.data.movie.repository.MoviesRemote
import com.example.tvm.remote.config.RemoteConfig
import com.example.tvm.remote.config.RemoteConfigTmdb
import com.example.tvm.remote.mapper.EntityMapper
import com.example.tvm.remote.movie.MoviesRemoteImpl
import com.example.tvm.remote.movie.mapper.*
import com.example.tvm.remote.movie.model.*
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

    /*@Binds
    abstract fun bindMoviesLatestMapper(impl: MoviesLatestMapper): EntityMapper<MoviesLatestModel, MoviesLatestEntity>

    @Binds
    abstract fun bindMoviesNowPlayingMapper(impl: MoviesNowPlayingMapper): EntityMapper<MoviesNowPlayingModel, MoviesNowPlayingEntity>

    @Binds
    abstract fun bindMoviesPopularMapper(impl: MoviesPopularMapper): EntityMapper<MoviesPopularModel, MoviesPopularEntity>

    @Binds
    abstract fun bindMoviesTopRatedMapper(impl: MoviesTopRatedMapper): EntityMapper<MoviesTopRatedModel, MoviesTopRatedEntity>

    @Binds
    abstract fun bindMoviesUpcomingMapper(impl: MoviesUpcomingMapper): EntityMapper<MoviesUpcomingModel, MoviesUpcomingEntity>*/

}