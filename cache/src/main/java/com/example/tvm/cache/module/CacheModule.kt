package com.example.tvm.cache.module

import com.example.tvm.cache.MoviesCacheImpl
import com.example.tvm.data.movie.repository.MoviesCache
import dagger.Binds
import dagger.Module

@Module
abstract class CacheModule {

    @Binds
    abstract fun bindCache(cacheImpl: MoviesCacheImpl): MoviesCache

}