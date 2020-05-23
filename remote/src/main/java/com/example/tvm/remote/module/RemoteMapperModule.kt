package com.example.tvm.remote.module

import com.example.tvm.remote.movie.mapper.*
import dagger.Module
import dagger.Provides

@Module
object RemoteMapperModule {

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
    fun provideEntityResultsMapper(
        entityDatesMapper: EntityDatesMapper,
        entityMovieMapper: EntityMovieMapper
    ) = EntityMoviesResultsMapper(
        entityDatesMapper = entityDatesMapper,
        entityMovieMapper = entityMovieMapper
    )

    @JvmStatic
    @Provides
    fun provideEntityMovieMapper() = EntityMovieMapper()

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
