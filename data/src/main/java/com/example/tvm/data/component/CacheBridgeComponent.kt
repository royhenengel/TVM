package com.example.tvm.data.component

import com.example.tvm.data.movie.repository.MoviesCache

interface CacheBridgeComponent {

    fun provideMoviesCache(): MoviesCache
}