package com.example.tvm.remote.module

import com.example.tvm.data.repository.movies.MoviesRemote
import com.example.tvm.remote.movie.MoviesRemoteImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RemoteModule {

    @Binds
    abstract fun bindRemoteMovies(moviesRemoteImpl: MoviesRemoteImpl): MoviesRemote

}