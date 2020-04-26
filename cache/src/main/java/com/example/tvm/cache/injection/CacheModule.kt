package com.example.tvm.cache.injection

import com.example.tvm.cache.MoviesCacheImpl
import com.example.tvm.data.repository.movies.MoviesCache
import dagger.Binds
import dagger.Module

@Module
abstract class CacheModule {

    @Binds
    abstract fun bindCache(cacheImpl: MoviesCacheImpl): MoviesCache

}