package com.example.tvm.data.module

import com.example.tvm.data.movie.mapper.*
import com.example.tvm.data.movie.repository.MoviesRepositoryImpl
import com.example.tvm.data.movie.source.MoviesDataStoreFactory
import com.example.tvm.domain.repository.MoviesRepository
import dagger.Module
import dagger.Provides

@Module(includes = [
    DataMoviesMapperModule::class
])
object DataMoviesModule {

    @JvmStatic
    @Provides
    fun bindMoviesRepository(
        dataStoreFactory: MoviesDataStoreFactory,
        latestMoviesMapper: MoviesLatestMapper,
        nowPlayingMoviesMapper: MoviesNowPlayingMapper,
        popularMoviesMapper: MoviesPopularMapper,
        topRatedMoviesMapper: MoviesTopRatedMapper,
        upComingMoviesMapper: MoviesUpcomingMapper,
        movieDetailsMapper: MovieDetailsMapper
    ): MoviesRepository = MoviesRepositoryImpl(
        dataStoreFactory = dataStoreFactory,
        latestMoviesMapper = latestMoviesMapper,
        nowPlayingMoviesMapper = nowPlayingMoviesMapper,
        popularMoviesMapper = popularMoviesMapper,
        topRatedMoviesMapper = topRatedMoviesMapper,
        upComingMoviesMapper = upComingMoviesMapper,
        movieDetailsMapper = movieDetailsMapper
    )

}
