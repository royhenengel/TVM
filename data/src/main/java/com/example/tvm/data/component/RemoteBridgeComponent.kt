package com.example.tvm.data.component

import com.example.tvm.data.repository.movies.MoviesRemote

interface RemoteBridgeComponent {

    fun provideRemoteMovies(): MoviesRemote
}