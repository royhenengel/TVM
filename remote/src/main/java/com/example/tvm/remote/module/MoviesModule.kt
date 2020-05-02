package com.example.tvm.remote.module

import com.example.tvm.base.logging.Logger
import com.example.tvm.data.movie.repository.MoviesRemote
import com.example.tvm.remote.RetrofitProvider
import com.example.tvm.remote.config.RemoteConfig
import com.example.tvm.remote.movie.MoviesRemoteImpl
import com.example.tvm.remote.movie.mapper.*
import com.example.tvm.remote.movie.service.ServiceMovies
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
object MoviesModule {

    @JvmStatic
    @Provides
    fun provideMoviesService(
        @Named(RemoteModule.RETROFIT_PROVIDER_TMDB) retrofitProvider: RetrofitProvider
    ): ServiceMovies = retrofitProvider.retrofit().create(ServiceMovies::class.java)

    @JvmStatic
    @Provides
    fun provideMoviesRemote(
        @Named(RemoteBindsModule.CONFIG_REMOTE_TMDB) remoteConfig: RemoteConfig,
        logger: Logger,
        service: ServiceMovies,
        latestMoviesMapper: EntityMoviesLatestMapper,
        nowPlayingMoviesMapper: EntityMoviesNowPlayingMapper,
        popularMoviesMapper: EntityMoviesPopularMapper,
        topRatedMoviesMapper: EntityMoviesTopRatedMapper,
        upComingMoviesMapper: EntityMoviesUpcomingMapper
    ): MoviesRemote = MoviesRemoteImpl(
        logger = logger,
        remoteConfig = remoteConfig,
        service = service,
        latestEntityMoviesMapper = latestMoviesMapper,
        nowPlayingEntityMoviesMapper = nowPlayingMoviesMapper,
        popularEntityMoviesMapper = popularMoviesMapper,
        upComingEntityMoviesMapper = upComingMoviesMapper,
        topRatedEntityMoviesMapper = topRatedMoviesMapper
    )

    @JvmStatic
    @Provides
    fun provideEntityMoviesLatestMapper(
        entityGenreMapper: EntityGenreMapper
    ) = EntityMoviesLatestMapper(
        entityGenreMapper = entityGenreMapper
    )

    @JvmStatic
    @Provides
    fun provideEntityMoviesNowPlayingMapper(
        entityDatesMapper: EntityDatesMapper,
        entityResultsMapper: EntityResultsMapper
    ) = EntityMoviesNowPlayingMapper(
        entityDatesMapper = entityDatesMapper,
        entityResultsMapper = entityResultsMapper
    )

    @JvmStatic
    @Provides
    fun provideEntityMoviesPopularMapper(
        entityResultsMapper: EntityResultsMapper
    ) = EntityMoviesPopularMapper(
        entityResultsMapper = entityResultsMapper
    )

    @JvmStatic
    @Provides
    fun provideEntityMoviesTopRatedMapper(
        entityResultsMapper: EntityResultsMapper
    ) = EntityMoviesTopRatedMapper(
        entityResultsMapper = entityResultsMapper
    )

    @JvmStatic
    @Provides
    fun provideMoviesUpcomingMapper(
        entityDatesMapper: EntityDatesMapper,
        entityResultsMapper: EntityResultsMapper
    ) = EntityMoviesUpcomingMapper(
        entityDatesMapper = entityDatesMapper,
        entityResultsMapper = entityResultsMapper
    )

    @JvmStatic
    @Provides
    fun provideEntityResultsMapper() = EntityResultsMapper()

    @JvmStatic
    @Provides
    fun provideEntityGenreMapper() = EntityGenreMapper()

    @JvmStatic
    @Provides
    fun provideEntityDatesMapper() = EntityDatesMapper()

}