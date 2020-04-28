package com.example.tvm.data.module

import com.example.tvm.data.movie.repository.MoviesRepositoryImpl
import com.example.tvm.domain.repository.MoviesRepository
import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindMoviesRepository(moviesRepositoryImpl: MoviesRepositoryImpl): MoviesRepository

}