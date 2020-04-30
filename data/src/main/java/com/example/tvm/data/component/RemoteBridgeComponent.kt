package com.example.tvm.data.component

import com.example.tvm.data.movie.repository.MoviesRemote

interface RemoteBridgeComponent {

    fun provideRemoteMovies(): MoviesRemote

}