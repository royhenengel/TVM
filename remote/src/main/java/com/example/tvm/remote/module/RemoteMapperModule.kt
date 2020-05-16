package com.example.tvm.remote.module

import com.example.tvm.remote.movie.mapper.*
import dagger.Module
import dagger.Provides

@Module
object RemoteMapperModule {

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
    fun provideEntityMovieDetailsMapper(
        genreMapper: EntityGenreMapper,
        productionCountriesMapper: EntityProductionCountriesMapper,
        productionCompanyMapper: EntityProductionCompanyMapper,
        spokenLanguageMapper: EntitySpokenLanguageMapper
    ) = EntityMovieDetailsMapper(
        genreMapper = genreMapper,
        productionCountriesMapper = productionCountriesMapper,
        productionCompanyMapper = productionCompanyMapper,
        spokenLanguageMapper = spokenLanguageMapper
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

    @JvmStatic
    @Provides
    fun provideEntityProductionCountriesMapper() = EntityProductionCountriesMapper()

    @JvmStatic
    @Provides
    fun provideEntityProductionCompanyMapper() = EntityProductionCompanyMapper()

    @JvmStatic
    @Provides
    fun provideEntitySpokenLanguageMapper() = EntitySpokenLanguageMapper()

}
