package com.example.tvm.remote.injection

import com.example.tvm.data.repository.movies.MoviesRemote
import com.example.tvm.remote.MoviesRemoteImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RemoteModule {

    @Binds
    abstract fun bindRemote(remoteImpl: MoviesRemoteImpl): MoviesRemote

}