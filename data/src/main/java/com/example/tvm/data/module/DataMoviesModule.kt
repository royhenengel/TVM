package com.example.tvm.data.module

import com.example.tvm.data.movie.mapper.*
import com.example.tvm.data.movie.repository.MoviesRepositoryImpl
import com.example.tvm.data.movie.source.MoviesDataStoreFactory
import com.example.tvm.domain.repository.MoviesRepository
import dagger.Module
import dagger.Provides

@Module
object DataMoviesModule {

    @JvmStatic
    @Provides
    fun bindMoviesRepository(
        dataStoreFactory: MoviesDataStoreFactory,
        latestMoviesMapper: MoviesLatestMapper,
        nowPlayingMoviesMapper: MoviesNowPlayingMapper,
        popularMoviesMapper: MoviesPopularMapper,
        topRatedMoviesMapper: MoviesTopRatedMapper,
        upComingMoviesMapper: MoviesUpcomingMapper
    ): MoviesRepository = MoviesRepositoryImpl(
        dataStoreFactory = dataStoreFactory,
        latestMoviesMapper = latestMoviesMapper,
        nowPlayingMoviesMapper = nowPlayingMoviesMapper,
        popularMoviesMapper = popularMoviesMapper,
        topRatedMoviesMapper = topRatedMoviesMapper,
        upComingMoviesMapper = upComingMoviesMapper
    )

    @JvmStatic
    @Provides
    fun provideMoviesLatestMapper(
        genreMapper: GenreMapper
    ) = MoviesLatestMapper(genreMapper = genreMapper)

    @JvmStatic
    @Provides
    fun provideMoviesNowPlayingMapper(
        datesMapper: DatesMapper,
        resultsMapper: ResultsMapper
    ) = MoviesNowPlayingMapper(
        datesMapper = datesMapper,
        resultsMapper = resultsMapper
    )

    @JvmStatic
    @Provides
    fun provideMoviesPopularMapper(
        resultsMapper: ResultsMapper
    ) = MoviesPopularMapper(
        resultsMapper = resultsMapper
    )

    @JvmStatic
    @Provides
    fun provideMoviesTopRatedMapper(
        resultsMapper: ResultsMapper
    ) = MoviesTopRatedMapper(
        resultsMapper = resultsMapper
    )

    @JvmStatic
    @Provides
    fun provideMoviesUpcomingMapper(
        datesMapper: DatesMapper,
        resultsMapper: ResultsMapper
    ) = MoviesUpcomingMapper(
        datesMapper = datesMapper,
        resultsMapper = resultsMapper
    )

    @JvmStatic
    @Provides
    fun provideResultsMapper() = ResultsMapper()

    @JvmStatic
    @Provides
    fun provideGenreMapper() = GenreMapper()

    @JvmStatic
    @Provides
    fun provideDatesMapper() = DatesMapper()

}
