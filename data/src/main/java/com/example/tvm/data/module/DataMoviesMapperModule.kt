package com.example.tvm.data.module

import com.example.tvm.data.movie.mapper.*
import dagger.Module
import dagger.Provides

@Module
object DataMoviesMapperModule {

    @JvmStatic
    @Provides
    fun provideMoviesResultsMapper(
        datesMapper: DatesMapper,
        movieMapper: MovieMapper
    ) = MoviesResultsMapper(
        datesMapper = datesMapper,
        movieMapper = movieMapper
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
    fun provideResultsMapper() = MovieMapper()

    @JvmStatic
    @Provides
    fun provideGenreMapper() = GenreMapper()

    @JvmStatic
    @Provides
    fun provideDatesMapper() = DatesMapper()
}
