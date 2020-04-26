package com.example.tvm.data.component

import com.example.tvm.data.repository.movies.MoviesCache

interface CacheBridgeComponent {

    fun provideMoviesCache(): MoviesCache
}