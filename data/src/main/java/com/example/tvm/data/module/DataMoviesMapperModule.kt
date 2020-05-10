package com.example.tvm.data.module

import com.example.tvm.data.movie.mapper.*
import dagger.Module
import dagger.Provides

@Module
object DataMoviesMapperModule {

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
    fun provideMoviesDetailsMapper(
        genreMapper: GenreMapper,
        productionCountriesMapper: ProductionCountriesMapper,
        productionCompanyMapper: ProductionCompanyMapper,
        spokenLanguageMapper: SpokenLanguageMapper
    ) = MovieDetailsMapper(
        genreMapper = genreMapper,
        productionCountriesMapper = productionCountriesMapper,
        productionCompanyMapper = productionCompanyMapper,
        spokenLanguageMapper = spokenLanguageMapper
    )

    @JvmStatic
    @Provides
    fun provideProductionCountriesMapper() = ProductionCountriesMapper()

    @JvmStatic
    @Provides
    fun provideProductionCompanyMapper() = ProductionCompanyMapper()

    @JvmStatic
    @Provides
    fun provideSpokenLanguageMapper() = SpokenLanguageMapper()

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
